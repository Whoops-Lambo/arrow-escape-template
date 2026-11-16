package com.facebook.applinks;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.a0;
import com.facebook.appevents.l;
import com.facebook.appevents.n;
import com.facebook.appevents.o;
import com.facebook.appevents.p;
import com.facebook.internal.b0;
import com.facebook.internal.v0;
import com.facebook.internal.z;
import com.facebook.k0;
import com.facebook.u;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.lz;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public static final /* synthetic */ int e = 0;
    public String a;
    public Uri b;
    public JSONObject c;
    public Bundle d;

    /* JADX WARN: Code duplicated, block: B:13:0x004e A[Catch: JSONException -> 0x00d9, TRY_LEAVE, TryCatch #2 {JSONException -> 0x00d9, blocks: (B:3:0x0005, B:5:0x0034, B:13:0x004e, B:11:0x0048, B:8:0x0040), top: B:63:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0 A[Catch: JSONException -> 0x00bb, Exception -> 0x00d3, TRY_ENTER, TryCatch #3 {JSONException -> 0x00bb, blocks: (B:33:0x00aa, B:36:0x00b0, B:37:0x00b3, B:39:0x00b7), top: B:65:0x00aa, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7 A[Catch: JSONException -> 0x00bb, Exception -> 0x00d3, TRY_LEAVE, TryCatch #3 {JSONException -> 0x00bb, blocks: (B:33:0x00aa, B:36:0x00b0, B:37:0x00b3, B:39:0x00b7), top: B:65:0x00aa, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5 A[Catch: JSONException -> 0x00d0, Exception -> 0x00d3, TRY_ENTER, TryCatch #5 {JSONException -> 0x00d0, blocks: (B:43:0x00bf, B:46:0x00c5, B:47:0x00c8, B:49:0x00cc), top: B:68:0x00bf, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc A[Catch: JSONException -> 0x00d0, Exception -> 0x00d3, TRY_LEAVE, TryCatch #5 {JSONException -> 0x00d0, blocks: (B:43:0x00bf, B:46:0x00c5, B:47:0x00c8, B:49:0x00cc), top: B:68:0x00bf, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void a(Context context, String str, b bVar) {
        JSONObject jSONObject;
        Bundle bundle;
        JSONObject jSONObject2;
        Bundle bundle2;
        String strP;
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("event", "DEFERRED_APP_LINK");
            v0.V(jSONObject3, com.facebook.internal.b.a(context), l.a(context), a0.f(context), context);
            v0.W(a0.a(), jSONObject3);
            jSONObject3.put("application_package_name", context.getPackageName());
            c cVarB = null;
            if (b0.b(z.ReferrerForDeepLink)) {
                if (lz.a.contains(o.class)) {
                    strP = null;
                    if (strP != null) {
                        jSONObject3.put("install_referrer", strP);
                    }
                } else {
                    try {
                        String str2 = o.c;
                        strP = n.p();
                    } catch (Throwable th) {
                        lz.a(o.class, th);
                        strP = null;
                    }
                    if (strP != null) {
                        jSONObject3.put("install_referrer", strP);
                    }
                }
            }
            String strConcat = str.concat("/activities");
            try {
                String str3 = k0.j;
                JSONObject jSONObject4 = com.explorestack.protobuf.adcom.c.n(null, strConcat, jSONObject3, null).c().b;
                if (jSONObject4 != null) {
                    String strOptString = jSONObject4.optString("applink_args");
                    long jOptLong = jSONObject4.optLong("click_time", -1L);
                    String strOptString2 = jSONObject4.optString("applink_class");
                    String strOptString3 = jSONObject4.optString("applink_url");
                    if (!TextUtils.isEmpty(strOptString) && (cVarB = b(strOptString)) != null) {
                        if (jOptLong != -1) {
                            try {
                                JSONObject jSONObject5 = cVarB.c;
                                if (jSONObject5 != null) {
                                    jSONObject5.put("com.facebook.platform.APPLINK_TAP_TIME_UTC", jOptLong);
                                }
                                Bundle bundle3 = cVarB.d;
                                if (bundle3 != null) {
                                    bundle3.putString("com.facebook.platform.APPLINK_TAP_TIME_UTC", Long.toString(jOptLong));
                                    if (strOptString2 != null) {
                                        try {
                                            jSONObject = cVarB.c;
                                            if (jSONObject != null) {
                                                jSONObject.put("com.facebook.platform.APPLINK_NATIVE_CLASS", strOptString2);
                                            }
                                            bundle = cVarB.d;
                                            if (bundle != null) {
                                                bundle.putString("com.facebook.platform.APPLINK_NATIVE_CLASS", strOptString2);
                                                if (strOptString3 != null) {
                                                    try {
                                                        jSONObject2 = cVarB.c;
                                                        if (jSONObject2 != null) {
                                                            jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                                        }
                                                        bundle2 = cVarB.d;
                                                        if (bundle2 != null) {
                                                            bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                                        }
                                                    } catch (JSONException unused) {
                                                        a0 a0Var = a0.a;
                                                    }
                                                }
                                            } else if (strOptString3 != null) {
                                                jSONObject2 = cVarB.c;
                                                if (jSONObject2 != null) {
                                                    jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                                }
                                                bundle2 = cVarB.d;
                                                if (bundle2 != null) {
                                                    bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                                }
                                            }
                                        } catch (JSONException unused2) {
                                            a0 a0Var2 = a0.a;
                                        }
                                    } else if (strOptString3 != null) {
                                        jSONObject2 = cVarB.c;
                                        if (jSONObject2 != null) {
                                            jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                        }
                                        bundle2 = cVarB.d;
                                        if (bundle2 != null) {
                                            bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                        }
                                    }
                                } else if (strOptString2 != null) {
                                    jSONObject = cVarB.c;
                                    if (jSONObject != null) {
                                        jSONObject.put("com.facebook.platform.APPLINK_NATIVE_CLASS", strOptString2);
                                    }
                                    bundle = cVarB.d;
                                    if (bundle != null) {
                                        bundle.putString("com.facebook.platform.APPLINK_NATIVE_CLASS", strOptString2);
                                        if (strOptString3 != null) {
                                            jSONObject2 = cVarB.c;
                                            if (jSONObject2 != null) {
                                                jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                            }
                                            bundle2 = cVarB.d;
                                            if (bundle2 != null) {
                                                bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                            }
                                        }
                                    } else if (strOptString3 != null) {
                                        jSONObject2 = cVarB.c;
                                        if (jSONObject2 != null) {
                                            jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                        }
                                        bundle2 = cVarB.d;
                                        if (bundle2 != null) {
                                            bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                        }
                                    }
                                } else if (strOptString3 != null) {
                                    jSONObject2 = cVarB.c;
                                    if (jSONObject2 != null) {
                                        jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                    }
                                    bundle2 = cVarB.d;
                                    if (bundle2 != null) {
                                        bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                    }
                                }
                            } catch (JSONException unused3) {
                                a0 a0Var3 = a0.a;
                            }
                        } else if (strOptString2 != null) {
                            jSONObject = cVarB.c;
                            if (jSONObject != null) {
                                jSONObject.put("com.facebook.platform.APPLINK_NATIVE_CLASS", strOptString2);
                            }
                            bundle = cVarB.d;
                            if (bundle != null) {
                                bundle.putString("com.facebook.platform.APPLINK_NATIVE_CLASS", strOptString2);
                                if (strOptString3 != null) {
                                    jSONObject2 = cVarB.c;
                                    if (jSONObject2 != null) {
                                        jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                    }
                                    bundle2 = cVarB.d;
                                    if (bundle2 != null) {
                                        bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                    }
                                }
                            } else if (strOptString3 != null) {
                                jSONObject2 = cVarB.c;
                                if (jSONObject2 != null) {
                                    jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                }
                                bundle2 = cVarB.d;
                                if (bundle2 != null) {
                                    bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                                }
                            }
                        } else if (strOptString3 != null) {
                            jSONObject2 = cVarB.c;
                            if (jSONObject2 != null) {
                                jSONObject2.put("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                            }
                            bundle2 = cVarB.d;
                            if (bundle2 != null) {
                                bundle2.putString("com.facebook.platform.APPLINK_NATIVE_URL", strOptString3);
                            }
                        }
                    }
                }
            } catch (Exception unused4) {
                a0 a0Var4 = a0.a;
            }
            bVar.onDeferredAppLinkDataFetched(cVarB);
        } catch (JSONException e2) {
            throw new u("An error occurred while preparing deferred app link", e2);
        }
    }

    public static c b(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("version");
            if (!jSONObject.getJSONObject("bridge_args").getString("method").equals("applink") || !string.equals("2")) {
                return null;
            }
            c cVar = new c();
            JSONObject jSONObject2 = jSONObject.getJSONObject("method_args");
            cVar.c = jSONObject2;
            boolean zHas = jSONObject2.has("ref");
            JSONObject jSONObject3 = cVar.c;
            if (zHas) {
                cVar.a = jSONObject3.getString("ref");
            } else if (jSONObject3.has("referer_data")) {
                JSONObject jSONObject4 = cVar.c.getJSONObject("referer_data");
                if (jSONObject4.has("fb_ref")) {
                    cVar.a = jSONObject4.getString("fb_ref");
                }
            }
            if (cVar.c.has("target_url")) {
                Uri uri = Uri.parse(cVar.c.getString("target_url"));
                cVar.b = uri;
                c(uri);
            }
            if (cVar.c.has(HandleInvocationsFromAdViewer.KEY_EXTRAS)) {
                JSONObject jSONObject5 = cVar.c.getJSONObject(HandleInvocationsFromAdViewer.KEY_EXTRAS);
                if (jSONObject5.has("deeplink_context")) {
                    JSONObject jSONObject6 = jSONObject5.getJSONObject("deeplink_context");
                    if (jSONObject6.has("promo_code")) {
                        jSONObject6.getString("promo_code");
                    }
                }
            }
            cVar.d = d(cVar.c);
            return cVar;
        } catch (u unused) {
            a0 a0Var = a0.a;
            return null;
        } catch (JSONException unused2) {
            a0 a0Var2 = a0.a;
            return null;
        }
    }

    public static void c(Uri uri) {
        if (lz.a.contains(c.class) || uri == null) {
            return;
        }
        try {
            String queryParameter = uri.getQueryParameter("al_applink_data");
            if (queryParameter == null) {
                return;
            }
            try {
                new JSONObject(queryParameter);
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            lz.a(c.class, th);
        }
    }

    public static Bundle d(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                bundle.putBundle(next, d((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int i = 0;
                if (jSONArray.length() == 0) {
                    bundle.putStringArray(next, new String[0]);
                } else {
                    Object obj2 = jSONArray.get(0);
                    if (obj2 instanceof JSONObject) {
                        Bundle[] bundleArr = new Bundle[jSONArray.length()];
                        while (i < jSONArray.length()) {
                            bundleArr[i] = d(jSONArray.getJSONObject(i));
                            i++;
                        }
                        bundle.putParcelableArray(next, bundleArr);
                    } else {
                        if (obj2 instanceof JSONArray) {
                            p.e("Nested arrays are not supported.");
                            return null;
                        }
                        String[] strArr = new String[jSONArray.length()];
                        while (i < jSONArray.length()) {
                            strArr[i] = jSONArray.get(i).toString();
                            i++;
                        }
                        bundle.putStringArray(next, strArr);
                    }
                }
            } else {
                bundle.putString(next, obj.toString());
            }
        }
        return bundle;
    }
}
