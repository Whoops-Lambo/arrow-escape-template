package com.bytedance.sdk.component.noq.ahm.rz.kgy.kgy;

import com.bytedance.sdk.component.noq.rz;
import com.bytedance.sdk.component.utils.ra;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ahm implements rz {
    private kgy ahm;
    private int kgy;

    @Override // com.bytedance.sdk.component.noq.kgy
    /* JADX INFO: renamed from: rz, reason: merged with bridge method [inline-methods] */
    public boolean ahm(String str) {
        try {
            InputStream inputStreamKgy = this.ahm.kgy(str);
            boolean z = inputStreamKgy != null;
            ra.kgy(inputStreamKgy);
            return z;
        } catch (Throwable th) {
            try {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6AulAC0bImEQ8RW", "a+8quRGpSsiVRMN5hQKrC1rtJZA=", "WOEjgQK1Z9Q=", Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
                th.getMessage();
                return false;
            } finally {
                ra.kgy(null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v7 */
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
    @Override // com.bytedance.sdk.component.noq.kgy
    /* JADX INFO: renamed from: ahm, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] kgy(String str) throws Throwable {
        ?? r8;
        ?? r7;
        InputStream inputStreamKgy;
        ByteArrayOutputStream byteArrayOutputStream;
        kgy kgyVar = this.ahm;
        if (kgyVar != null) {
            try {
                if (str != null) {
                    try {
                        inputStreamKgy = kgyVar.kgy(str);
                        if (inputStreamKgy != null) {
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int i = inputStreamKgy.read(bArr);
                                        if (i == -1) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr, 0, i);
                                    }
                                } catch (IOException e) {
                                    e = e;
                                    inputStreamKgy = inputStreamKgy;
                                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6AulAC0bImEQ8RW", "a+8quRGpSsiVRMN5hQKrC1rtJZA=", "XOs5", 103);
                                }
                            } catch (IOException e2) {
                                e = e2;
                                byteArrayOutputStream = null;
                                inputStreamKgy = inputStreamKgy;
                                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pV6AulAC0bImEQ8RW", "a+8quRGpSsiVRMN5hQKrC1rtJZA=", "XOs5", 103);
                            } catch (Throwable th) {
                                th = th;
                                r8 = 0;
                                r7 = inputStreamKgy;
                                ra.kgy(r7);
                                ra.kgy(r8);
                                throw th;
                            }
                        } else {
                            byteArrayOutputStream = null;
                        }
                        if (byteArrayOutputStream != null) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            ra.kgy(inputStreamKgy);
                            ra.kgy(byteArrayOutputStream);
                            return byteArray;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        inputStreamKgy = null;
                        byteArrayOutputStream = null;
                    } catch (Throwable th2) {
                        r8 = 0;
                        th = th2;
                        r7 = 0;
                    }
                    ra.kgy(inputStreamKgy);
                    ra.kgy(byteArrayOutputStream);
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                r7 = kgyVar;
                r8 = str;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.noq.kgy
    public boolean kgy(String str, byte[] bArr) {
        kgy kgyVar = this.ahm;
        if (kgyVar == null || bArr == null || str == null) {
            return false;
        }
        return kgyVar.kgy(str, bArr);
    }

    public ahm(File file, long j) {
        int i = (int) j;
        this.kgy = i;
        this.ahm = kgy.kgy(i, file);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.noq.rz
    public InputStream kgy(String str) {
        kgy kgyVar = this.ahm;
        if (kgyVar == null) {
            return null;
        }
        return kgyVar.kgy(str);
    }
}
