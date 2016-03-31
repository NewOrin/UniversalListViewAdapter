package com.neworin.util;

import java.util.List;

import com.neworin.activity.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public abstract class CommonAdapter<T> extends BaseAdapter {

	public Context mContext;
	public List<T> mDatas;
	public LayoutInflater mInflater;

	public CommonAdapter(Context context, List<T> datas) {
		this.mContext = context;
		this.mDatas = datas;
		mInflater = LayoutInflater.from(context);
	}

	public int getCount() {
		return mDatas.size();
	}

	public T getItem(int arg0) {
		return mDatas.get(arg0);
	}

	public long getItemId(int arg0) {
		return arg0;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = ViewHolder.get(mContext, convertView, parent,
				R.layout.item, position);
		convert(holder, getItem(position));

		return holder.getConvertView();
	}

	public abstract void convert(ViewHolder holder, T t);
}
