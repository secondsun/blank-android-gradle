package org.feedhenry.blank;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeFragment extends Fragment {

	public static final String MESSAGE = "MESSAGE";

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
							 @Nullable Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.home_fragment, null);

		TextView textView = (TextView) view.findViewById(R.id.result);
		textView.setText(getArguments().getString(MESSAGE));

		return view;
	}

}
