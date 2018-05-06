package com.zhou.zz.netty.websocket;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.stream.ChunkedWriteHandler;

/**
 * 服务器端的启动类
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月24日下午10:23:57
 */
public class WebSocketServer {

	private static final String HTTP_CODEC = "http-codec";

	private static final String AGGREGATOR = "aggregator";

	private static final String HTTP_CHUNKED = "http-chunked";

	private static final String HANDLER = "handler";

	public void run(int port) throws InterruptedException {
		EventLoopGroup boss = new NioEventLoopGroup();
		EventLoopGroup worker = new NioEventLoopGroup();

		ServerBootstrap serverBootstrap = new ServerBootstrap();
		serverBootstrap.group(boss, worker).channel(NioServerSocketChannel.class)
				.childHandler(new ChannelInitializer<SocketChannel>() {

					@Override
					protected void initChannel(SocketChannel ch) throws Exception {
						ChannelPipeline pipeline = ch.pipeline();
						pipeline.addLast(HTTP_CODEC, new HttpServerCodec());
						pipeline.addLast(AGGREGATOR, new HttpObjectAggregator(65535));
						pipeline.addLast(HTTP_CHUNKED, new ChunkedWriteHandler());
						pipeline.addLast(HANDLER, new WebSocketHandler());
					}

				});

		try {
			Channel channel = serverBootstrap.bind(port).sync().channel();
			System.out.println("web socket server start at port " + port);
			System.out.println("Opne your browser and navigate to http://localhost:" + port);
			channel.closeFuture().sync();
		} finally {
			boss.shutdownGracefully();
			worker.shutdownGracefully();
		}

	}
}
