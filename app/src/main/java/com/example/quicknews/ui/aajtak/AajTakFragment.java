package com.example.quicknews.ui.aajtak;

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

public class AajTakFragment extends Fragment {

    private AajTakViewModel aajTakViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        aajTakViewModel =
                new ViewModelProvider(this).get(AajTakViewModel.class);
        View root = inflater.inflate(R.layout.fragment_aajtak, container, false);

        WebView webView = root.findViewById(R.id.webView_aajtak);
        webView.loadUrl("https://www.aajtak.in/");
        webView.setWebViewClient(new WebViewController());

        return root;
    }
}