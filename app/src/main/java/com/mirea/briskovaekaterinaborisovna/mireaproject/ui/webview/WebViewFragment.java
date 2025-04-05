package com.mirea.briskovaekaterinaborisovna.mireaproject.ui.webview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.mirea.briskovaekaterinaborisovna.mireaproject.R;

public class WebViewFragment extends Fragment {

    private WebView webView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_webview, container, false);
        webView = root.findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://github.com/EkaterinaBriskova/MobileDev");
        return root;
    }
}