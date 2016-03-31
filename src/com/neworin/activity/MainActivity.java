package com.neworin.activity;

import java.util.ArrayList;
import java.util.List;

import com.neworin.bean.Bean;
import com.neworin.util.CommonAdapter;
import com.neworin.util.ViewHolder;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

	List<Bean> mList = new ArrayList<Bean>();
	private ListView mListView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mListView = (ListView) findViewById(R.id.mListView);
		for (int i = 0; i < 10; i++) {
			mList.add(new Bean("ÄãºÃ" + i));
		}
		mListView.setAdapter(new CommonAdapter<Bean>(MainActivity.this, mList) {
			@Override
			public void convert(ViewHolder holder, Bean bean) {
				holder.setText(R.id.tv_title, bean.getTitle());
			}
		});
	}
}
