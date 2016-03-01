package org.feedhenry.blank;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

	private static final String TAG = MainActivity.class.getName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);

		init();
	}

	private void navigateTo(Fragment fragment) {
		getSupportFragmentManager()
				.beginTransaction()
				.replace(R.id.content, fragment)
				.commit();
	}

	private void init() {
		navigateTo(new InitFragment());
	}

	public void navigateToHome(String message) {
		Bundle args = new Bundle();
		args.putString(HomeFragment.MESSAGE, message);

		Fragment fragment = new HomeFragment();
		fragment.setArguments(args);

		navigateTo(fragment);
	}

}
