package com.bytedance.sdk.component.fi.ahm;

import android.text.TextUtils;
import android.util.Pair;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.ahm.kgy.at;
import com.bytedance.sdk.component.ahm.kgy.gf;
import com.bytedance.sdk.component.ahm.kgy.kus;
import com.bytedance.sdk.component.ahm.kgy.noq;
import com.bytedance.sdk.component.ahm.kgy.nu;
import com.bytedance.sdk.component.ahm.kgy.twf;
import com.bytedance.sdk.component.ahm.kgy.vs;
import com.ironsource.G5;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class uq extends rz {
    twf kgy;

    private byte[] noq(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream2.write(str.getBytes(G5.O));
                        try {
                            gZIPOutputStream2.close();
                        } catch (IOException e) {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4IUtGZe9iiWFqhm1Q==", "a+E+gSakbMSVXthP", "WOEghRG5etTSbc1UnA==", 328);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        gZIPOutputStream = gZIPOutputStream2;
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4IUtGZe9iiWFqhm1Q==", "a+E+gSakbMSVXthP", "WOEghRG5etTSbc1UnA==", Sdk.SDKError.Reason.MRAID_UNRECOGNIZED_COMMAND_VALUE);
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException e3) {
                                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e3, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4IUtGZe9iiWFqhm1Q==", "a+E+gSakbMSVXthP", "WOEghRG5etTSbc1UnA==", 328);
                            }
                        }
                        if (byteArrayOutputStream != null) {
                        }
                        return byteArray;
                    } catch (Throwable th) {
                        th = th;
                        gZIPOutputStream = gZIPOutputStream2;
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException e4) {
                                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e4, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4IUtGZe9iiWFqhm1Q==", "a+E+gSakbMSVXthP", "WOEghRG5etTSbc1UnA==", 328);
                            }
                        }
                        if (byteArrayOutputStream == null) {
                            throw th;
                        }
                        byteArrayOutputStream.toByteArray();
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (IOException e5) {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e5, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4IUtGZe9iiWFqhm1Q==", "a+E+gSakbMSVXthP", "WOEghRG5etTSbc1UnA==", 336);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e6) {
                e = e6;
            }
        } catch (IOException e7) {
            e = e7;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e8) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e8, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4IUtGZe9iiWFqhm1Q==", "a+E+gSakbMSVXthP", "WOEghRG5etTSbc1UnA==", 336);
        }
        return byteArray;
    }

    @Override // com.bytedance.sdk.component.fi.ahm.rz
    public com.bytedance.sdk.component.fi.ahm kgy() {
        com.bytedance.sdk.component.fi.ahm ahmVar;
        com.bytedance.sdk.component.fi.ahm ahmVar2;
        try {
            at.kgy kgyVar = new at.kgy();
            if (TextUtils.isEmpty(this.fi)) {
                return new com.bytedance.sdk.component.fi.ahm(false, 5000, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            kgyVar.ahm(this.fi);
            if (this.kgy == null) {
                return new com.bytedance.sdk.component.fi.ahm(false, 5000, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            ahm(kgyVar);
            kgyVar.kgy((Object) uq());
            kgy(kgyVar);
            Pair<kus, Exception> pairKgy = kgy(kgyVar.kgy(this.kgy).ahm());
            Object obj = pairKgy.second;
            if (obj != null) {
                return new com.bytedance.sdk.component.fi.ahm(false, 5001, ((Exception) obj).getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
            }
            kus kusVar = (kus) pairKgy.first;
            if (kusVar == null) {
                return null;
            }
            kgy(kusVar.gf());
            HashMap map = new HashMap();
            noq noqVarYo = kusVar.yo();
            if (noqVarYo != null) {
                for (int i = 0; i < noqVarYo.kgy(); i++) {
                    String strKgy = noqVarYo.kgy(i);
                    String strAhm = noqVarYo.ahm(i);
                    map.put(strKgy, strAhm);
                    if (strKgy != null && strKgy.equalsIgnoreCase("content-type")) {
                        map.put("content-type", strAhm == null ? "" : strAhm.toLowerCase());
                    }
                }
            }
            vs vsVarNoq = kusVar.noq();
            if (vsVarNoq == null) {
                ahmVar2 = new com.bytedance.sdk.component.fi.ahm(false, 5001, kusVar.ct(), null, "BODY_NULL_BODY", 1L, 1L);
            } else {
                if (com.bytedance.sdk.component.fi.rz.kgy.kgy(map)) {
                    byte[] bArrUq = vsVarNoq.uq();
                    ahmVar = new com.bytedance.sdk.component.fi.ahm(kusVar.uq(), kusVar.rz(), kusVar.ct(), map, null, kusVar.ahm(), kusVar.kgy());
                    ahmVar.kgy(bArrUq);
                } else if (this.ra) {
                    byte[] bArrUq2 = vsVarNoq.uq();
                    ahmVar = new com.bytedance.sdk.component.fi.ahm(kusVar.uq(), kusVar.rz(), kusVar.ct(), map, new String(bArrUq2, kgy(kgy(vsVarNoq))), kusVar.ahm(), kusVar.kgy());
                    ahmVar.kgy(bArrUq2);
                } else {
                    ahmVar = new com.bytedance.sdk.component.fi.ahm(kusVar.uq(), kusVar.rz(), kusVar.ct(), map, vsVarNoq.ahm(), kusVar.ahm(), kusVar.kgy());
                }
                ahmVar2 = ahmVar;
            }
            kgy(ahmVar2, kusVar);
            return ahmVar2;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4IUtGZe9iiWFqhm1Q==", "a+E+gSakbMSVXthP", "XvYolhaobO6OXtJPghCs", 290);
            return new com.bytedance.sdk.component.fi.ahm(false, 5001, th.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    public uq(nu nuVar) {
        super(nuVar);
        this.kgy = null;
    }

    public void ct(String str) {
        if (TextUtils.isEmpty(str)) {
            str = JsonUtils.EMPTY_JSON;
        }
        this.kgy = twf.kgy(gf.kgy("application/json; charset=utf-8"), str);
    }

    public void kgy(JSONObject jSONObject) {
        String string;
        if (jSONObject != null) {
            string = jSONObject.toString();
        } else {
            string = JsonUtils.EMPTY_JSON;
        }
        this.kgy = twf.kgy(gf.kgy("application/json; charset=utf-8"), string);
    }

    public void kgy(String str, byte[] bArr) {
        this.kgy = twf.kgy(gf.kgy(str), bArr);
    }

    @Override // com.bytedance.sdk.component.fi.ahm.rz
    public void kgy(final com.bytedance.sdk.component.fi.kgy.kgy kgyVar) {
        try {
            at.kgy kgyVar2 = new at.kgy();
            if (TextUtils.isEmpty(this.fi)) {
                kgyVar.kgy(this, new IOException("Url is Empty"));
                return;
            }
            if (!TextUtils.isEmpty(this.ct)) {
                kgyVar2.kgy(this.ct);
            }
            int i = this.noq;
            if (i > 0) {
                kgyVar2.kgy(i);
            }
            kgyVar2.ahm(this.fi);
            if (this.kgy == null) {
                if (kgyVar != null) {
                    kgyVar.kgy(this, new IOException("RequestBody is null, content type is not support!!"));
                }
            } else {
                ahm(kgyVar2);
                kgyVar2.kgy((Object) uq());
                kgy(kgyVar2);
                this.rz.kgy(kgyVar2.kgy(this.kgy).ahm()).kgy(new com.bytedance.sdk.component.ahm.kgy.rz() { // from class: com.bytedance.sdk.component.fi.ahm.uq.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.sdk.component.ahm.kgy.noq] */
                    /* JADX WARN: Type inference failed for: r13v4, types: [com.bytedance.sdk.component.fi.kgy.kgy] */
                    /* JADX WARN: Type inference failed for: r1v1 */
                    /* JADX WARN: Type inference failed for: r1v2 */
                    /* JADX WARN: Type inference failed for: r1v9 */
                    /* JADX WARN: Type inference failed for: r2v1 */
                    /* JADX WARN: Type inference failed for: r2v10, types: [com.bytedance.sdk.component.fi.ahm] */
                    /* JADX WARN: Type inference failed for: r2v12 */
                    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
                    /* JADX WARN: Type inference failed for: r2v15 */
                    /* JADX WARN: Type inference failed for: r2v16 */
                    /* JADX WARN: Type inference failed for: r2v17 */
                    /* JADX WARN: Type inference failed for: r2v18 */
                    /* JADX WARN: Type inference failed for: r2v19 */
                    /* JADX WARN: Type inference failed for: r2v2, types: [com.bytedance.sdk.component.fi.ahm] */
                    /* JADX WARN: Type inference failed for: r2v6 */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // com.bytedance.sdk.component.ahm.kgy.rz
                    public void kgy(com.bytedance.sdk.component.ahm.kgy.ahm ahmVar, kus kusVar) throws IOException {
                        Throwable th;
                        ?? r2;
                        ?? ahmVar2;
                        com.bytedance.sdk.component.fi.kgy.kgy kgyVar3 = kgyVar;
                        if (kgyVar3 != null) {
                            uq uqVar = uq.this;
                            if (kusVar == null) {
                                kgyVar3.kgy(uqVar, new IOException("No response"));
                                return;
                            }
                            uqVar.kgy(kusVar.gf());
                            ?? r1 = 0;
                            IOException iOException = null;
                            try {
                                HashMap map = new HashMap();
                                ?? Yo = kusVar.yo();
                                if (Yo != 0) {
                                    ahmVar2 = 0;
                                    while (ahmVar2 < Yo.kgy()) {
                                        String strKgy = Yo.kgy(ahmVar2);
                                        String strAhm = Yo.ahm(ahmVar2);
                                        map.put(strKgy, strAhm);
                                        if (strKgy != null && strKgy.equalsIgnoreCase("content-type")) {
                                            map.put("content-type", strAhm == null ? "" : strAhm.toLowerCase());
                                        }
                                        ahmVar2++;
                                    }
                                }
                                vs vsVarNoq = kusVar.noq();
                                try {
                                    if (com.bytedance.sdk.component.fi.rz.kgy.kgy(map)) {
                                        byte[] bArrUq = vsVarNoq.uq();
                                        com.bytedance.sdk.component.fi.ahm ahmVar3 = new com.bytedance.sdk.component.fi.ahm(kusVar.uq(), kusVar.rz(), kusVar.ct(), map, null, kusVar.ahm(), kusVar.kgy());
                                        ahmVar3.kgy(bArrUq);
                                        ahmVar2 = ahmVar3;
                                    } else if (uq.this.ra) {
                                        byte[] bArrUq2 = vsVarNoq.uq();
                                        uq uqVar2 = uq.this;
                                        com.bytedance.sdk.component.fi.ahm ahmVar4 = new com.bytedance.sdk.component.fi.ahm(kusVar.uq(), kusVar.rz(), kusVar.ct(), map, new String(bArrUq2, uqVar2.kgy(uqVar2.kgy(vsVarNoq))), kusVar.ahm(), kusVar.kgy());
                                        ahmVar4.kgy(bArrUq2);
                                        ahmVar2 = ahmVar4;
                                    } else {
                                        if (vsVarNoq == null) {
                                            throw new IOException(kusVar.ct());
                                        }
                                        ahmVar2 = new com.bytedance.sdk.component.fi.ahm(kusVar.uq(), kusVar.rz(), kusVar.ct(), map, vsVarNoq.ahm(), kusVar.ahm(), kusVar.kgy());
                                    }
                                    uq.this.kgy((com.bytedance.sdk.component.fi.ahm) ahmVar2, kusVar);
                                    r2 = ahmVar2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r1 = ahmVar2;
                                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4IUtGZe9iiWFqhm1Q==", "a+E+gSakbMSVXthPyEA=", "VOAfkBCsZsmTTw==", 175);
                                    r2 = r1;
                                    iOException = new IOException(th);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            ?? r13 = kgyVar;
                            if (r2 != 0) {
                                r13.kgy(uq.this, r2);
                                return;
                            }
                            if (!(r13 instanceof com.bytedance.sdk.component.fi.kgy.ahm)) {
                                uq uqVar3 = uq.this;
                                if (iOException == null) {
                                    iOException = new IOException("Unexpected exception");
                                }
                                r13.kgy(uqVar3, iOException);
                                return;
                            }
                            com.bytedance.sdk.component.fi.kgy.ahm ahmVar5 = (com.bytedance.sdk.component.fi.kgy.ahm) r13;
                            uq uqVar4 = uq.this;
                            if (iOException == null) {
                                iOException = new IOException("Unexpected exception");
                            }
                            ahmVar5.kgy(uqVar4, iOException, new com.bytedance.sdk.component.fi.ahm(kusVar.uq(), kusVar.rz(), kusVar.ct(), null, null, kusVar.ahm(), kusVar.kgy()));
                        }
                    }

                    @Override // com.bytedance.sdk.component.ahm.kgy.rz
                    public void kgy(com.bytedance.sdk.component.ahm.kgy.ahm ahmVar, IOException iOException) {
                        com.bytedance.sdk.component.fi.kgy.kgy kgyVar3 = kgyVar;
                        if (kgyVar3 != null) {
                            kgyVar3.kgy(uq.this, iOException);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4IUtGZe9iiWFqhm1Q==", "a+E+gSakbMSVXthP", "XuA8gAapbO6OXtJPghCs", 193);
            kgyVar.kgy(this, new IOException(th.getMessage()));
        }
    }

    private Pair<kus, Exception> kgy(at atVar) {
        try {
            return new Pair<>(this.rz.kgy(atVar).ahm(), null);
        } catch (IOException e) {
            return new Pair<>(null, e);
        }
    }

    public void kgy(String str, boolean z) {
        if (z) {
            kgy("application/json; charset=utf-8", noq(str));
            ahm("Content-Encoding", "gzip");
        } else {
            ct(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Charset kgy(gf gfVar) {
        try {
            return gfVar != null ? gfVar.kgy(com.bytedance.sdk.component.ahm.kgy.ahm.gf.kgy) : com.bytedance.sdk.component.ahm.kgy.ahm.gf.kgy;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4IUtGZe9iiWFqhm1Q==", "a+E+gSakbMSVXthP", "WOYshxC5fQ==", 348);
            return com.bytedance.sdk.component.ahm.kgy.ahm.gf.kgy;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public gf kgy(vs vsVar) {
        try {
            return vsVar.ct();
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4IUtGZe9iiWFqhm1Q==", "a+E+gSakbMSVXthP", "WOEjgQayffOZWtI=", 356);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kgy(com.bytedance.sdk.component.fi.ahm ahmVar, kus kusVar) {
        if (ahmVar == null || kusVar == null) {
            return;
        }
        ahmVar.kgy(kusVar.fi());
    }
}
