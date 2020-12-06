package com.example.quicknews.ui.zeenews;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.quicknews.R;
import com.example.quicknews.WebViewController;

public class ZeeNewsFragment extends Fragment {

    private ZeeNewsViewModel zeeNewsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        zeeNewsViewModel =
                new ViewModelProvider(this).get(ZeeNewsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_zeenews, container, false);

        WebView webView = root.findViewById(R.id.webView_zeeNews);
        webView.loadUrl("https://zeenews.india.com/");
        webView.setWebViewClient(new WebViewController());

        return root;
    }
}