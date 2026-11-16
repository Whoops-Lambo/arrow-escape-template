package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class h implements b, Handler.Callback {
    protected Pattern a;
    protected String b;
    protected Context d;
    protected WindVaneWebView e;
    protected final int c = 1;
    protected Handler f = new Handler(Looper.getMainLooper(), this);

    public a c(String str) {
        if (str == null) {
            return null;
        }
        a aVarA = com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.e, str);
        if (aVarA != null) {
            aVarA.b = this.e;
            return aVarA;
        }
        Matcher matcher = this.a.matcher(str);
        if (matcher.matches()) {
            a aVar = new a();
            int iGroupCount = matcher.groupCount();
            if (iGroupCount >= 5) {
                aVar.f = matcher.group(5);
            }
            if (iGroupCount >= 3) {
                aVar.d = matcher.group(1);
                aVar.g = matcher.group(2);
                String strGroup = matcher.group(3);
                aVar.e = strGroup;
                HashMap<String, String> map = com.mbridge.msdk.mbsignalcommon.base.e.k;
                if (map != null && map.containsKey(strGroup)) {
                    aVar.e = com.mbridge.msdk.mbsignalcommon.base.e.k.get(aVar.e);
                }
                aVar.b = this.e;
                return aVar;
            }
        }
        return null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/windvane/h;->handleMessage(Landroid/os/Message;)Z");
        boolean zSafedk_h_handleMessage_36c818e2bae56b0bccddbb07f37e736e = safedk_h_handleMessage_36c818e2bae56b0bccddbb07f37e736e(message);
        BrandSafetyUtils.onWindVaneSignalCommunicationHandleMessage(com.safedk.android.utils.h.o, this, message);
        return zSafedk_h_handleMessage_36c818e2bae56b0bccddbb07f37e736e;
    }

    public void a(a aVar) {
        WindVaneWebView windVaneWebView = aVar.b;
        Object jsObject = windVaneWebView == null ? null : windVaneWebView.getJsObject(aVar.d);
        if (jsObject == null) {
            return;
        }
        try {
            com.mbridge.msdk.mbsignalcommon.mapping.b.C1450b c1450bA = com.mbridge.msdk.mbsignalcommon.mapping.b.a(this.d.getClassLoader(), jsObject.getClass().getName()).a(aVar.e, Object.class, String.class);
            c1450bA.a();
            if (jsObject instanceof g) {
                aVar.a = c1450bA;
                aVar.c = jsObject;
                a(1, aVar);
            }
        } catch (com.mbridge.msdk.mbsignalcommon.mapping.a e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void d(String str) {
        this.b = str;
    }

    public boolean safedk_h_handleMessage_36c818e2bae56b0bccddbb07f37e736e(Message p0) {
        a aVar = (a) p0.obj;
        if (aVar == null) {
            return false;
        }
        try {
            if (p0.what == 1) {
                Object obj = aVar.c;
                com.mbridge.msdk.mbsignalcommon.mapping.b.C1450b c1450b = aVar.a;
                if (c1450b != null && obj != null) {
                    c1450b.a(obj, aVar, TextUtils.isEmpty(aVar.f) ? JsonUtils.EMPTY_JSON : aVar.f);
                }
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public h(Context context) {
        this.d = context;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public boolean b(String str) {
        if (i.f(str)) {
            a(i.c(str));
            d(str);
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(String str) {
        a aVarC;
        if (TextUtils.isEmpty(str) || (aVarC = c(str)) == null) {
            return;
        }
        a(aVarC);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(WindVaneWebView windVaneWebView) {
        this.e = windVaneWebView;
    }

    public void a(int i, a aVar) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = aVar;
        this.f.sendMessage(messageObtain);
    }

    public void a(Pattern pattern) {
        this.a = pattern;
    }
}
