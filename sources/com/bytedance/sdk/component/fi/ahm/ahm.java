package com.bytedance.sdk.component.fi.ahm;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.ahm.kgy.at;
import com.bytedance.sdk.component.ahm.kgy.kus;
import com.bytedance.sdk.component.ahm.kgy.noq;
import com.bytedance.sdk.component.ahm.kgy.nu;
import com.bytedance.sdk.component.ahm.kgy.vs;
import com.bytedance.sdk.component.ahm.kgy.yo;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ahm extends rz {
    private boolean at;
    private com.bytedance.sdk.component.ahm.kgy.kgy nu;
    private Map<String, String> twf;
    public static final com.bytedance.sdk.component.ahm.kgy.kgy kgy = new com.bytedance.sdk.component.ahm.kgy.kgy.C0212kgy().kgy().ahm();
    public static final com.bytedance.sdk.component.ahm.kgy.kgy ahm = new com.bytedance.sdk.component.ahm.kgy.kgy.C0212kgy().ahm();

    @Override // com.bytedance.sdk.component.fi.ahm.rz
    public com.bytedance.sdk.component.fi.ahm kgy() {
        try {
            at.kgy kgyVar = new at.kgy();
            if (this.at) {
                kgyVar.ahm(this.fi);
            } else {
                yo.kgy kgyVar2 = new yo.kgy();
                Uri uri = Uri.parse(this.fi);
                kgyVar2.kgy(uri.getScheme());
                kgyVar2.ahm(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    kgyVar2.rz(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.twf.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.twf.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        kgyVar2.kgy(strEncode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                kgyVar.kgy(kgyVar2.ahm());
            }
            ahm(kgyVar);
            kgy(kgyVar);
            kgyVar.kgy(this.nu);
            kgyVar.kgy((Object) uq());
            kus kusVarAhm = this.rz.kgy(kgyVar.kgy().ahm()).ahm();
            if (kusVarAhm == null) {
                return null;
            }
            kgy(kusVarAhm.gf());
            HashMap map = new HashMap();
            noq noqVarYo = kusVarAhm.yo();
            if (noqVarYo != null) {
                for (int i = 0; i < noqVarYo.kgy(); i++) {
                    map.put(noqVarYo.kgy(i), noqVarYo.ahm(i));
                }
            }
            vs vsVarNoq = kusVarAhm.noq();
            return new com.bytedance.sdk.component.fi.ahm(kusVarAhm.uq(), kusVarAhm.rz(), kusVarAhm.ct(), map, vsVarNoq != null ? vsVarNoq.ahm() : "", kusVarAhm.ahm(), kusVarAhm.kgy());
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4IUtGZe9iiWFqhm1Q==", "fOs5sBu5atKURcU=", "XvYolhaobO6OXtJPghCs", 258);
            return null;
        }
    }

    public ahm(nu nuVar) {
        super(nuVar);
        this.nu = kgy;
        this.at = false;
        this.twf = new HashMap();
    }

    @Override // com.bytedance.sdk.component.fi.ahm.rz
    public void kgy(final com.bytedance.sdk.component.fi.kgy.kgy kgyVar) {
        try {
            at.kgy kgyVar2 = new at.kgy();
            if (this.at) {
                kgyVar2.ahm(this.fi);
            } else {
                yo.kgy kgyVar3 = new yo.kgy();
                Uri uri = Uri.parse(this.fi);
                kgyVar3.kgy(uri.getScheme());
                kgyVar3.ahm(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    kgyVar3.rz(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.twf.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.twf.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        kgyVar3.kgy(strEncode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                kgyVar2.kgy(kgyVar3.ahm());
            }
            ahm(kgyVar2);
            kgy(kgyVar2);
            kgyVar2.kgy(this.nu);
            kgyVar2.kgy((Object) uq());
            if (!TextUtils.isEmpty(this.ct)) {
                kgyVar2.kgy(this.ct);
            }
            int i = this.noq;
            if (i > 0) {
                kgyVar2.kgy(i);
            }
            this.rz.kgy(kgyVar2.kgy().ahm()).kgy(new com.bytedance.sdk.component.ahm.kgy.rz() { // from class: com.bytedance.sdk.component.fi.ahm.ahm.1
                @Override // com.bytedance.sdk.component.ahm.kgy.rz
                public void kgy(com.bytedance.sdk.component.ahm.kgy.ahm ahmVar, kus kusVar) throws IOException {
                    if (kgyVar != null) {
                        HashMap map = new HashMap();
                        if (kusVar != null) {
                            ahm.this.kgy(kusVar.gf());
                            noq noqVarYo = kusVar.yo();
                            if (noqVarYo != null) {
                                for (int i2 = 0; i2 < noqVarYo.kgy(); i2++) {
                                    map.put(noqVarYo.kgy(i2), noqVarYo.ahm(i2));
                                }
                            }
                            vs vsVarNoq = kusVar.noq();
                            kgyVar.kgy(ahm.this, new com.bytedance.sdk.component.fi.ahm(kusVar.uq(), kusVar.rz(), kusVar.ct(), map, vsVarNoq == null ? "" : vsVarNoq.ahm(), kusVar.ahm(), kusVar.kgy()));
                        }
                    }
                }

                @Override // com.bytedance.sdk.component.ahm.kgy.rz
                public void kgy(com.bytedance.sdk.component.ahm.kgy.ahm ahmVar, IOException iOException) {
                    com.bytedance.sdk.component.fi.kgy.kgy kgyVar4 = kgyVar;
                    if (kgyVar4 != null) {
                        kgyVar4.kgy(ahm.this, iOException);
                    }
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4IUtGZe9iiWFqhm1Q==", "fOs5sBu5atKURcU=", "XuA8gAapbO6OXtJPghCs", 175);
            if (kgyVar != null) {
                kgyVar.kgy(this, new IOException(th.getMessage()));
            }
        }
    }

    public void kgy(boolean z) {
        this.at = z;
    }
}
