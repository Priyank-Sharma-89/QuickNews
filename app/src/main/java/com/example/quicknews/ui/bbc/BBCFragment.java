package com.example.quicknews.ui.bbc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.quicknews.R;
import com.example.quicknews.WebViewController;

public class BBCFragment extends Fragment {

    private BBCViewModel BBCViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BBCViewModel =
                new ViewModelProvider(this).get(BBCViewModel.class);
        View root = inflater.inflate(R.layout.fragment_bbc, container, false);

        WebView webView = root.findViewById(R.id.bbc_webView);
        webView.loadUrl("https://www.bbc.com/hindi");
        webView.setWebViewClient(new WebViewController());

//        final TextView textView = root.findViewById(R.id.text_home);
//        BBCViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}