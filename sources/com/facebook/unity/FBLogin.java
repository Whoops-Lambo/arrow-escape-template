package com.facebook.unity;

import android.text.TextUtils;
import android.util.Log;
import com.explorestack.protobuf.z;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.a0;
import com.facebook.gamingservices.a;
import com.facebook.internal.j;
import com.facebook.l;
import com.facebook.login.v;
import com.facebook.login.x;
import com.facebook.login.y;
import com.facebook.p;
import com.facebook.u;
import defpackage.pv1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class FBLogin {
    public static void loginForTVWithPublishPermissions(String str, FBUnityLoginActivity fBUnityLoginActivity) {
        login(str, fBUnityLoginActivity, true, true);
    }

    public static void loginForTVWithReadPermissions(String str, FBUnityLoginActivity fBUnityLoginActivity) {
        login(str, fBUnityLoginActivity, false, true);
    }

    public static void loginWithPublishPermissions(String str, FBUnityLoginActivity fBUnityLoginActivity) {
        login(str, fBUnityLoginActivity, true, false);
    }

    public static void loginWithReadPermissions(String str, FBUnityLoginActivity fBUnityLoginActivity) {
        login(str, fBUnityLoginActivity, false, false);
    }

    public static void addLoginParametersToMessage(UnityMessage unityMessage, AccessToken accessToken, AuthenticationToken authenticationToken, String str) {
        unityMessage.put("key_hash", FB.getKeyHash());
        unityMessage.put("opened", Boolean.TRUE);
        unityMessage.put("access_token", accessToken.e);
        if (authenticationToken != null) {
            unityMessage.put("auth_token_string", authenticationToken.a);
            unityMessage.put("auth_nonce", authenticationToken.b);
        }
        unityMessage.put("expiration_timestamp", Long.valueOf(accessToken.a.getTime() / 1000).toString());
        unityMessage.put("user_id", accessToken.i);
        unityMessage.put("permissions", TextUtils.join(",", accessToken.b));
        unityMessage.put("declined_permissions", TextUtils.join(",", accessToken.c));
        String str2 = accessToken.k;
        if (str2 == null) {
            str2 = "facebook";
        }
        unityMessage.put("graph_domain", str2);
        Date date = accessToken.g;
        if (date != null) {
            unityMessage.put("last_refresh", Long.valueOf(date.getTime() / 1000).toString());
        }
        if (str == null || str.isEmpty()) {
            return;
        }
        unityMessage.put(Constants.CALLBACK_ID_KEY, str);
    }

    private static void login(String str, FBUnityLoginActivity fBUnityLoginActivity, boolean z, boolean z2) {
        if (!a0.r.get()) {
            Log.w(FB.TAG, "Facebook SDK not initialized. Call init() before calling login()");
            return;
        }
        final UnityMessage unityMessage = new UnityMessage("OnLoginComplete");
        unityMessage.put("key_hash", FB.getKeyHash());
        UnityParams unityParams = UnityParams.parse(str, "couldn't parse login params: " + str);
        final String string = null;
        ArrayList arrayList = unityParams.hasString("scope").booleanValue() ? new ArrayList(Arrays.asList(unityParams.getString("scope").split(","))) : null;
        if (unityParams.has(Constants.CALLBACK_ID_KEY)) {
            string = unityParams.getString(Constants.CALLBACK_ID_KEY);
            unityMessage.put(Constants.CALLBACK_ID_KEY, string);
        }
        x xVarA = x.a();
        l callbackManager = fBUnityLoginActivity.getCallbackManager();
        p pVar = new p() { // from class: com.facebook.unity.FBLogin.1
            @Override // com.facebook.p
            public void onCancel() {
                unityMessage.putCancelled();
                unityMessage.send();
            }

            @Override // com.facebook.p
            public void onError(u uVar) {
                Log.w(FB.TAG, "Error occurred, ", uVar);
                unityMessage.sendError(uVar.getMessage());
            }

            @Override // com.facebook.p
            public void onSuccess(y yVar) {
                FBLogin.sendLoginSuccessMessage(yVar.a, yVar.b, string);
            }
        };
        if (!(callbackManager instanceof j)) {
            com.facebook.appevents.p.e("Unexpected CallbackManager, please use the provided Factory.");
            return;
        }
        ((j) callbackManager).a.put(Integer.valueOf(z.a(1)), new a(4, xVarA, pVar));
        x xVarA2 = z2 ? x.a() : x.a();
        if (z) {
            if (arrayList != null) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    String str2 = (String) obj;
                    v vVar = x.b;
                    if (!v.a(str2)) {
                        throw new u(pv1.n("Cannot pass a read permission (", str2, ") to a request for publish authorization"));
                    }
                }
            }
            xVarA2.c(fBUnityLoginActivity, new com.facebook.login.p(0, arrayList));
            return;
        }
        if (arrayList != null) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                String str3 = (String) obj2;
                v vVar2 = x.b;
                if (v.a(str3)) {
                    throw new u(pv1.n("Cannot pass a publish or manage permission (", str3, ") to a request for read authorization"));
                }
            }
        }
        xVarA2.c(fBUnityLoginActivity, new com.facebook.login.p(0, arrayList));
    }

    public static void sendLoginSuccessMessage(AccessToken accessToken, AuthenticationToken authenticationToken, String str) {
        UnityMessage unityMessage = new UnityMessage("OnLoginComplete");
        addLoginParametersToMessage(unityMessage, accessToken, authenticationToken, str);
        unityMessage.send();
    }
}
