package defpackage;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import com.google.android.gms.internal.ads.zzfyd;
import com.google.android.gms.internal.ads.zzfyu;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class gj4 implements WebViewCompat.WebMessageListener {
    public final /* synthetic */ zzfyd a;

    public gj4(zzfyd zzfydVar) {
        this.a = zzfydVar;
    }

    @Override // androidx.webkit.WebViewCompat.WebMessageListener
    public final void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy) {
        String strA = webMessageCompat.a();
        zzfyd zzfydVar = this.a;
        zzfydVar.getClass();
        try {
            JSONObject jSONObject = new JSONObject(strA);
            zzfydVar.b.a(jSONObject.getString("method"), jSONObject.getJSONObject("data"));
        } catch (JSONException e) {
            zzfyu.a("Error parsing JS message", e);
        }
    }
}
