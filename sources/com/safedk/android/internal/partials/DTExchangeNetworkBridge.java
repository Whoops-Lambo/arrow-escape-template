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
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: DTExchangeSourceFile */
/* JADX INFO: loaded from: classes2.dex */
public class DTExchangeNetworkBridge {
    public static InputStream urlConnectionGetInputStream(URLConnection targetInstance) throws IOException {
        Logger.d("DTExchangeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/DTExchangeNetworkBridge;->urlConnectionGetInputStream(Ljava/net/URLConnection;)Ljava/io/InputStream;");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && targetInstance.getURL() != null) {
            try {
                String string = targetInstance.getURL().toString();
                Logger.d("SafeDKNetwork", "urlConnectionGetInputStream : ", string, ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME =  ", h.p);
                Map<String, List<String>> headerFields = targetInstance.getHeaderFields();
                InputStream inputStream = null;
                try {
                    inputStream = targetInstance.getInputStream();
                } catch (Throwable th) {
                    Logger.d("SafeDKNetwork", "Exception in urlConnectionGetInputStream : ", th.getMessage());
                }
                InputStream inputStreamA = CreativeInfoManager.a(h.p, string, inputStream, headerFields);
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
        Logger.d("DTExchangeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/DTExchangeNetworkBridge;->urlConnectionGetOutputStream(Ljava/net/URLConnection;)Ljava/io/OutputStream;");
        OutputStream outputStream = targetInstance.getOutputStream();
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && targetInstance.getURL() != null) {
            try {
                String string = targetInstance.getURL().toString();
                Logger.d("SafeDKNetwork", "urlConnectionGetOutputStream url=", string, ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME = ", h.p);
                return CreativeInfoManager.a(h.p, string, outputStream);
            } catch (Throwable th) {
                Logger.e("SafeDKNetwork", "urlConnectionGetOutputStream exception", th);
            }
        }
        return outputStream;
    }

    public static int httpUrlConnectionGetResponseCode(HttpURLConnection targetInstance) throws IOException {
        String string;
        Logger.d("DTExchangeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/DTExchangeNetworkBridge;->httpUrlConnectionGetResponseCode(Ljava/net/HttpURLConnection;)I");
        int responseCode = targetInstance.getResponseCode();
        try {
            if (targetInstance.getURL() != null) {
                string = targetInstance.getURL().toString();
            } else {
                string = null;
            }
            Logger.d("SafeDKNetwork", "httpUrlConnectionGetResponseCode - sdk=", h.p, ", response code= ", Integer.valueOf(responseCode), ", url= ", string);
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && responseCode >= 200 && responseCode < 300 && CreativeInfoManager.a(h.p, AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, false)) {
                CreativeInfoManager.onResourceLoaded(h.p, null, string);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "httpUrlConnectionGetResponseCode exception", th);
        }
        return responseCode;
    }

    public static void httpUrlConnectionDisconnect(HttpURLConnection targetInstance) {
        Logger.d("DTExchangeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/DTExchangeNetworkBridge;->httpUrlConnectionDisconnect(Ljava/net/HttpURLConnection;)V");
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

    public static void webviewLoadUrl(WebView targetInstance, String url) {
        Logger.d("DTExchangeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/DTExchangeNetworkBridge;->webviewLoadUrl(Landroid/webkit/WebView;Ljava/lang/String;)V");
        try {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: ", url, ", WebView address : ", targetInstance.toString(), ", SDK_PACKAGE_NAME = ", h.p);
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                if (TextUtils.isEmpty(url) || url.startsWith("javascript:")) {
                    Logger.d("SafeDKNetwork", "webviewLoadUrl2 loadUrl url is null or a javascript command : ", url);
                } else {
                    NetworkBridge.logWebviewLoadURLRequest(h.p, targetInstance, url);
                    AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(h.p);
                    if (adNetworkDiscoveryJ != null && adNetworkDiscoveryJ.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                        CreativeInfoManager.a(url, (String) null, targetInstance, h.p);
                    }
                    SafeDKWebAppInterface.a(h.p, targetInstance, url, true);
                }
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadUrl2 exception", th);
        }
        targetInstance.loadUrl(url);
    }

    public static void webviewLoadDataWithBaseURL(WebView targetInstance, String baseUrl, String data, String mimeType, String encoding, String historyUrl) {
        Logger.d("DTExchangeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/DTExchangeNetworkBridge;->webviewLoadDataWithBaseURL(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        String strA = data;
        try {
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                Logger.d("SafeDKNetwork", "webviewLoadDataWithBaseURL: ", baseUrl, ", WebView address : ", targetInstance.toString(), ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME = ", h.p);
                CreativeInfoManager.a(baseUrl, strA, targetInstance, h.p);
                SafeDKWebAppInterface.a(h.p, targetInstance, strA, true);
            }
            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(h.p);
            if (adNetworkDiscoveryJ != null) {
                strA = adNetworkDiscoveryJ.a(targetInstance, baseUrl, strA);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadDataWithBaseURL exception", th);
        }
        String data2 = strA;
        targetInstance.loadDataWithBaseURL(baseUrl, data2, mimeType, encoding, historyUrl);
    }

    public static void webviewLoadData(WebView targetInstance, String data, String mimeType, String encoding) {
        Logger.d("DTExchangeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/DTExchangeNetworkBridge;->webviewLoadData(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        try {
            boolean z = SafeDK.getInstance() != null && SafeDK.getInstance().p();
            Logger.d("SafeDKNetwork", "webviewLoadData invoked, WebView address : ", targetInstance, ", isSafeDKInitialized = ", Boolean.valueOf(z), ", SDK_PACKAGE_NAME = ", h.p);
            if (z) {
                CreativeInfoManager.a((String) null, data, targetInstance, h.p);
                SafeDKWebAppInterface.a(h.p, targetInstance, data, true);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadData exception", th);
        }
        targetInstance.loadData(data, mimeType, encoding);
    }

    @SuppressLint({"AddJavascriptInterface", "JavascriptInterface"})
    public static void webviewAddJavascriptInterface(WebView targetInstance, Object object, String name) {
        Logger.d("DTExchangeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/DTExchangeNetworkBridge;->webviewAddJavascriptInterface(Landroid/webkit/WebView;Ljava/lang/Object;Ljava/lang/String;)V");
        try {
            Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, WebView address: ", targetInstance, ", SDK_PACKAGE_NAME: ", h.p, " object is: ", object, " and name: ", name);
            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(h.p);
            if (adNetworkDiscoveryJ != null) {
                adNetworkDiscoveryJ.a(targetInstance, object);
            } else {
                Logger.d("SafeDKNetwork", "onAddedJavascriptInterface invoked, discovery not found for sdk: ", h.p, ", add to pending list");
                d.b(targetInstance, object);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewAddJavascriptInterface exception", th);
        }
        targetInstance.addJavascriptInterface(object, name);
    }

    public static Response okhttp3CallExecute(Call targetInstance) throws IOException {
        Logger.d("DTExchangeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/DTExchangeNetworkBridge;->okhttp3CallExecute(Lokhttp3/Call;)Lokhttp3/Response;");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            try {
                Request request = targetInstance.request();
                int iIdentityHashCode = System.identityHashCode(request);
                String string = request.url().getUrl();
                NetworkBridge.RequestInfo requestInfo = NetworkBridge.d.get(Integer.valueOf(iIdentityHashCode));
                if (requestInfo == null) {
                    requestInfo = new NetworkBridge.RequestInfo(h.p, string);
                } else {
                    requestInfo.a(string);
                }
                NetworkBridge.d.put(Integer.valueOf(iIdentityHashCode), requestInfo);
                Logger.d("SafeDKNetwork", "retrofitCall_execute request id:", Integer.valueOf(iIdentityHashCode), ", RequestInfo:", requestInfo, ", isOnUiThread = ", Boolean.valueOf(n.c()));
            } catch (Throwable th) {
                Logger.d("SafeDKNetwork", "retrofit|okhttp3 okhttp3.Call execute error ", th.getMessage());
            }
        }
        return targetInstance.execute();
    }

    public static ResponseBody okhttp3Response_body(Response targetInstance) {
        Logger.d("DTExchangeNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/DTExchangeNetworkBridge;->okhttp3Response_body(Lokhttp3/Response;)Lokhttp3/ResponseBody;");
        ResponseBody responseBodyBody = targetInstance.body();
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            try {
                int iIdentityHashCode = System.identityHashCode(targetInstance);
                NetworkBridge.RequestInfo requestInfoRemove = NetworkBridge.d.remove(Integer.valueOf(iIdentityHashCode));
                Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body response id ", Integer.valueOf(iIdentityHashCode), ", info ", requestInfoRemove, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                if (requestInfoRemove != null) {
                    int iIdentityHashCode2 = System.identityHashCode(responseBodyBody);
                    NetworkBridge.d.put(Integer.valueOf(iIdentityHashCode2), requestInfoRemove);
                    Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body, removing response Id:", Integer.valueOf(iIdentityHashCode), ", adding  responseBodyId:", Integer.valueOf(iIdentityHashCode2), ", RequestInfo:", requestInfoRemove);
                } else {
                    Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body, skipping response Id:", Integer.valueOf(iIdentityHashCode));
                }
            } catch (Throwable th) {
                Logger.d("SafeDKNetwork", "retrofitokhttp3Response_body error ", th.getMessage());
            }
        }
        return responseBodyBody;
    }
}
