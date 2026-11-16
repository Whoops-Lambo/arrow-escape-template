package com.safedk.android.internal.partials;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.f;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PangleSourceFile */
/* JADX INFO: loaded from: classes2.dex */
public class PangleNetworkBridge {
    public static InputStream urlConnectionGetInputStream(URLConnection targetInstance) throws IOException {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/PangleNetworkBridge;->urlConnectionGetInputStream(Ljava/net/URLConnection;)Ljava/io/InputStream;");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && targetInstance.getURL() != null) {
            try {
                String string = targetInstance.getURL().toString();
                Logger.d("SafeDKNetwork", "urlConnectionGetInputStream : ", string, ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME =  ", h.u);
                Map<String, List<String>> headerFields = targetInstance.getHeaderFields();
                InputStream inputStream = null;
                try {
                    inputStream = targetInstance.getInputStream();
                } catch (Throwable th) {
                    Logger.d("SafeDKNetwork", "Exception in urlConnectionGetInputStream : ", th.getMessage());
                }
                InputStream inputStreamA = CreativeInfoManager.a(h.u, string, inputStream, headerFields);
                if ((targetInstance instanceof HttpURLConnection) && (inputStreamA instanceof f)) {
                    Logger.d("SafeDKNetwork", "following HttpURLConnection:", targetInstance, " and stream: ", inputStreamA);
                    f fVar = (f) inputStreamA;
                    HttpURLConnection httpURLConnection = (HttpURLConnection) targetInstance;
                    NetworkBridge.b.put(httpURLConnection, fVar);
                    fVar.a(httpURLConnection);
                }
                return inputStreamA;
            } catch (Throwable th2) {
                Logger.e("SafeDKNetwork", "urlConnectionGetInputStream exception", th2);
            }
        }
        return targetInstance.getInputStream();
    }

    public static OutputStream urlConnectionGetOutputStream(URLConnection targetInstance) throws IOException {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/PangleNetworkBridge;->urlConnectionGetOutputStream(Ljava/net/URLConnection;)Ljava/io/OutputStream;");
        OutputStream outputStream = targetInstance.getOutputStream();
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && targetInstance.getURL() != null) {
            try {
                String string = targetInstance.getURL().toString();
                Logger.d("SafeDKNetwork", "urlConnectionGetOutputStream url=", string, ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME = ", h.u);
                return CreativeInfoManager.a(h.u, string, outputStream);
            } catch (Throwable th) {
                Logger.e("SafeDKNetwork", "urlConnectionGetOutputStream exception", th);
            }
        }
        return outputStream;
    }

    public static int httpUrlConnectionGetResponseCode(HttpURLConnection targetInstance) throws IOException {
        String string;
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/PangleNetworkBridge;->httpUrlConnectionGetResponseCode(Ljava/net/HttpURLConnection;)I");
        int responseCode = targetInstance.getResponseCode();
        try {
            if (targetInstance.getURL() != null) {
                string = targetInstance.getURL().toString();
            } else {
                string = null;
            }
            Logger.d("SafeDKNetwork", "httpUrlConnectionGetResponseCode - sdk=", h.u, ", response code= ", Integer.valueOf(responseCode), ", url= ", string);
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && responseCode >= 200 && responseCode < 300 && CreativeInfoManager.a(h.u, AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, false)) {
                CreativeInfoManager.onResourceLoaded(h.u, null, string);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "httpUrlConnectionGetResponseCode exception", th);
        }
        return responseCode;
    }

    public static void httpUrlConnectionDisconnect(HttpURLConnection targetInstance) {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/PangleNetworkBridge;->httpUrlConnectionDisconnect(Ljava/net/HttpURLConnection;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            try {
                Logger.d("SafeDKNetwork", "httpUrlConnectionDisconnect", ", isOnUiThread = ", Boolean.valueOf(n.c()));
                f fVarRemove = NetworkBridge.b.remove(targetInstance);
                if (fVarRemove != null) {
                    fVarRemove.a();
                }
            } catch (Throwable th) {
                Logger.e("SafeDKNetwork", "httpUrlConnectionDisconnect exception", th);
            }
        }
        targetInstance.disconnect();
    }

    public static void webviewLoadUrl(WebView targetInstance, String url, Map<String, String> additionalHttpHeaders) {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/PangleNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Map;)V");
        try {
            Logger.d("SafeDKNetwork", "webviewLoadUrl. url: ", url, ", WebView address : ", targetInstance.toString(), "  SDK_PACKAGE_NAME = ", h.u);
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                if (TextUtils.isEmpty(url) || url.startsWith("javascript:")) {
                    Logger.d("SafeDKNetwork", "webviewLoadUrl loadUrl url is null or a javascript command : ", url);
                } else {
                    NetworkBridge.logWebviewLoadURLRequest(h.u, targetInstance, url);
                    AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(h.u);
                    if (adNetworkDiscoveryJ != null && adNetworkDiscoveryJ.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                        CreativeInfoManager.a(url, (String) null, targetInstance, h.u);
                    }
                    SafeDKWebAppInterface.a(h.u, targetInstance, url, true);
                }
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadUrl exception", th);
        }
        targetInstance.loadUrl(url, additionalHttpHeaders);
    }

    public static void webviewLoadUrl(WebView targetInstance, String url) {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/PangleNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        try {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: ", url, ", WebView address : ", targetInstance.toString(), ", SDK_PACKAGE_NAME = ", h.u);
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                if (TextUtils.isEmpty(url) || url.startsWith("javascript:")) {
                    Logger.d("SafeDKNetwork", "webviewLoadUrl2 loadUrl url is null or a javascript command : ", url);
                } else {
                    NetworkBridge.logWebviewLoadURLRequest(h.u, targetInstance, url);
                    AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(h.u);
                    if (adNetworkDiscoveryJ != null && adNetworkDiscoveryJ.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                        CreativeInfoManager.a(url, (String) null, targetInstance, h.u);
                    }
                    SafeDKWebAppInterface.a(h.u, targetInstance, url, true);
                }
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadUrl2 exception", th);
        }
        targetInstance.loadUrl(url);
    }

    public static void webviewLoadDataWithBaseURL(WebView targetInstance, String baseUrl, String data, String mimeType, String encoding, String historyUrl) {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/PangleNetworkBridge;->webviewLoadDataWithBaseURL(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        String strA = data;
        try {
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                Logger.d("SafeDKNetwork", "webviewLoadDataWithBaseURL: ", baseUrl, ", WebView address : ", targetInstance.toString(), ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME = ", h.u);
                CreativeInfoManager.a(baseUrl, strA, targetInstance, h.u);
                SafeDKWebAppInterface.a(h.u, targetInstance, strA, true);
            }
            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(h.u);
            if (adNetworkDiscoveryJ != null) {
                strA = adNetworkDiscoveryJ.a(targetInstance, baseUrl, strA);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadDataWithBaseURL exception", th);
        }
        String data2 = strA;
        targetInstance.loadDataWithBaseURL(baseUrl, data2, mimeType, encoding, historyUrl);
    }

    @SuppressLint({"AddJavascriptInterface", "JavascriptInterface"})
    public static void webviewAddJavascriptInterface(WebView targetInstance, Object object, String name) {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/PangleNetworkBridge;->webviewAddJavascriptInterface(Landroid/webkit/WebView;Ljava/lang/Object;Ljava/lang/String;)V");
        try {
            Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, WebView address: ", targetInstance, ", SDK_PACKAGE_NAME: ", h.u, " object is: ", object, " and name: ", name);
            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(h.u);
            if (adNetworkDiscoveryJ != null) {
                adNetworkDiscoveryJ.a(targetInstance, object);
            } else {
                Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, discovery not found for sdk: ", h.u, ", add to pending list");
                d.b(targetInstance, object);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewAddJavascriptInterface exception", th);
        }
        targetInstance.addJavascriptInterface(object, name);
    }

    public static JSONObject jsonObjectInit(String message) throws JSONException {
        Logger.d("PangleNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/PangleNetworkBridge;->jsonObjectInit(Ljava/lang/String;)Lorg/json/JSONObject;");
        try {
            String strD = CreativeInfoManager.d(h.u, message);
            if (strD != null) {
                message = strD;
            }
            if (SafeDK.ad()) {
                CreativeInfoManager.c(h.u, message);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "jsonObjectInit exception", th);
        }
        return new JSONObject(message);
    }
}
