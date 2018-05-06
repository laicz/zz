package com.zhou.zz.zookeeper.test;

import java.io.IOException;
import java.util.List;

import org.I0Itec.zkclient.IZkChildListener;
import org.I0Itec.zkclient.ZkClient;

/**
 * 
 * @author Mr.Zhou
 * @datatime 2018年5月1日下午8:01:25
 */
public class TestWatcher {

	public static void main(String[] args) throws IOException {
		ZkClient client = new ZkClient("192.168.58.178:2181");
		// client.createPersistent("/parent", "逗你玩");
		client.subscribeChildChanges("/parent", new IZkChildListener() {

			@Override
			public void handleChildChange(String parentPath, List<String> currentChilds) throws Exception {
				System.out.println(parentPath + "变化了");
				System.out.println(currentChilds);
			}
		});

		System.in.read();
		client.close();
	}
}
