package com.bytedance.sdk.component.ra;

import android.webkit.WebSettings;
import com.bytedance.sdk.component.utils.sx;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class ra {
    public static void kgy(fi fiVar) {
        try {
            fi.rz scene = fiVar.getScene();
            fiVar.setSupportZoom(false);
            fiVar.setDisplayZoomControls(false);
            fiVar.setBuiltInZoomControls(false);
            fiVar.setSupportMultipleWindows(false);
            fiVar.setAllowFileAccess(false);
            fiVar.setSavePassword(false);
            fiVar.setWebViewClient(new fi.kgy());
            fiVar.setVerticalScrollBarEnabled(false);
            fiVar.setHorizontalScrollBarEnabled(false);
            fiVar.setMixedContentMode(0);
            fiVar.setDomStorageEnabled(true);
            fiVar.setLayerType(0, null);
            fiVar.setMediaPlaybackRequiresUserGesture(false);
            fiVar.setUseWideViewPort(true);
            fiVar.setLoadWithOverviewMode(true);
            if (scene != fi.rz.ADS && scene != fi.rz.ADS_V3 && scene != fi.rz.ADS_V4 && scene != fi.rz.EASY_PLAYABLE) {
                if (scene == fi.rz.LANDING_PAGE_WITH_VIDEO) {
                    fiVar.setLayerType(2, null);
                } else if (scene == fi.rz.VAST_ENDCARD) {
                    fiVar.setJavaScriptCanOpenWindowsAutomatically(true);
                    fiVar.setSupportZoom(true);
                    fiVar.setBuiltInZoomControls(true);
                    fiVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
                    fiVar.setDatabaseEnabled(true);
                } else {
                    sx.kgy("WebViewSettingsHelper", "initConfig: no special settings for scene = ".concat(String.valueOf(scene)));
                    return;
                }
            } else {
                fiVar.setJavaScriptCanOpenWindowsAutomatically(true);
                fiVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
                fiVar.setDatabaseEnabled(true);
            }
            sx.kgy("WebViewSettingsHelper", "initConfig: apply webview settings success for scene = ".concat(String.valueOf(scene)));
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "bOsvowq5fvSFXsNUghazAF7iPZAR", "UuAkgSCzZ8GJTQ==", 67);
            th.getMessage();
        }
    }
}
