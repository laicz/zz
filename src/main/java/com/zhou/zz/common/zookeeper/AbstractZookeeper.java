package com.zhou.zz.common.zookeeper;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.Watcher.Event.KeeperState;
import org.apache.zookeeper.ZooKeeper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractZookeeper implements Watcher {

	private static final Logger logger = LoggerFactory.getLogger(AbstractZookeeper.class);

	// 缓存时间
	private static final int SESSION_TIME = 2000;
	protected ZooKeeper zookeeper;
	protected CountDownLatch countDownLacLatch = new CountDownLatch(1);

	public void connect(String hosts) throws InterruptedException, IOException {
		zookeeper = new ZooKeeper(hosts, SESSION_TIME, this);
		countDownLacLatch.await();
	}

	@Override
	public void process(WatchedEvent event) {
		if (event.getState() == KeeperState.SyncConnected) {
			countDownLacLatch.countDown();
		}
	}

	public void close() throws InterruptedException {
		zookeeper.close();
	}
}
