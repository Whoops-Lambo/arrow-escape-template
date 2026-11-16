package com.bytedance.sdk.component.noq.ahm.ahm;

import com.bytedance.sdk.component.noq.fpp;
import com.bytedance.sdk.component.noq.um;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class rz implements noq {
    private void ahm(final com.bytedance.sdk.component.noq.ahm ahmVar, final com.bytedance.sdk.component.noq.ahm.rz.noq noqVar, final String str, final byte[] bArr) {
        if (ahmVar == null || !ahmVar.yo()) {
            return;
        }
        noqVar.fi().submit(new Runnable() { // from class: com.bytedance.sdk.component.noq.ahm.ahm.rz.1
            @Override // java.lang.Runnable
            public void run() {
                noqVar.rz(ahmVar).kgy(str, bArr);
            }
        });
    }

    @Override // com.bytedance.sdk.component.noq.ahm.ahm.noq
    public boolean kgy(com.bytedance.sdk.component.noq.ahm.rz.rz rzVar, fpp fppVar, com.bytedance.sdk.component.noq.ahm.rz.kgy kgyVar) {
        com.bytedance.sdk.component.noq.ahm ahmVarXh = rzVar.xh();
        com.bytedance.sdk.component.noq.ahm.rz.noq noqVarDg = rzVar.dg();
        byte[] bArrKgy = null;
        if (ahmVarXh != null && noqVarDg != null) {
            if (ahmVarXh.noq()) {
                if (fppVar != null) {
                    fppVar.kgy("data_cache", rzVar);
                }
                um umVarAhm = noqVarDg.ahm(ahmVarXh);
                if (umVarAhm != null) {
                    bArrKgy = umVarAhm.kgy(rzVar.yo());
                }
                if (fppVar != null) {
                    fppVar.ahm("data_cache", rzVar);
                }
                rzVar.yo();
                rzVar.kgy();
            }
            if (ahmVarXh.yo() && bArrKgy == null) {
                if (fppVar != null) {
                    fppVar.kgy("disk_cache", rzVar);
                }
                byte[] bArrKgy2 = kgy(ahmVarXh, noqVarDg, rzVar.yo());
                if (bArrKgy2 != null) {
                    kgy(rzVar.xh(), noqVarDg, rzVar.yo(), bArrKgy2);
                }
                if (fppVar != null) {
                    fppVar.ahm("disk_cache", rzVar);
                }
                rzVar.yo();
                rzVar.kgy();
                bArrKgy = bArrKgy2;
            }
        }
        if (noqVarDg != null && bArrKgy == null) {
            if (fppVar != null) {
                fppVar.kgy("net_request", rzVar);
            }
            bArrKgy = kgy(noqVarDg, rzVar, kgyVar);
            rzVar.yo();
            rzVar.kgy();
            if (fppVar != null) {
                fppVar.ahm("net_request", rzVar);
            }
        }
        if (bArrKgy == null) {
            rzVar.yo();
            rzVar.kgy();
            return false;
        }
        rzVar.kgy(bArrKgy);
        return true;
    }

    @Override // com.bytedance.sdk.component.noq.ahm.ahm.noq
    public String kgy() {
        return "data_intercept";
    }

    private byte[] kgy(com.bytedance.sdk.component.noq.ahm.rz.noq noqVar, com.bytedance.sdk.component.noq.ahm.rz.rz rzVar, com.bytedance.sdk.component.noq.ahm.rz.kgy kgyVar) {
        com.bytedance.sdk.component.noq.uq uqVarCt = noqVar.ct();
        rzVar.kgy(false);
        try {
            com.bytedance.sdk.component.noq.noq noqVarKgy = uqVarCt.kgy(new com.bytedance.sdk.component.noq.kgy.ahm(rzVar.kgy(), false, false, rzVar.um()));
            if (noqVarKgy == null) {
                kgyVar.kgy(1004, "call is empty", new Exception("call is empty"));
                return null;
            }
            int iKgy = noqVarKgy.kgy();
            if (iKgy == 200) {
                byte[] bArr = (byte[]) noqVarKgy.ahm();
                if (bArr == null) {
                    kgyVar.kgy(iKgy, noqVarKgy.rz(), new Exception("net data is empty"));
                    return null;
                }
                kgy(rzVar.xh(), noqVar, rzVar.yo(), bArr);
                ahm(rzVar.xh(), noqVar, rzVar.yo(), bArr);
                return bArr;
            }
            Object objAhm = noqVarKgy.ahm();
            kgyVar.kgy(iKgy, noqVarKgy.rz(), objAhm instanceof Throwable ? (Throwable) objAhm : null);
            return null;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA6MtS/oihw==", "a+8qsQKoaO6OXtJPjxSwPFT8", "V+EskS25fQ==", 111);
            kgyVar.kgy(1004, "net request failed!", th);
            return null;
        }
    }

    private byte[] kgy(com.bytedance.sdk.component.noq.ahm ahmVar, com.bytedance.sdk.component.noq.ahm.rz.noq noqVar, String str) {
        noqVar.rz(ahmVar);
        Collection<com.bytedance.sdk.component.noq.rz> collectionUq = noqVar.uq();
        if (collectionUq == null) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.noq.rz> it = collectionUq.iterator();
        while (it.hasNext()) {
            byte[] bArrKgy = it.next().kgy(str);
            if (bArrKgy != null) {
                return bArrKgy;
            }
        }
        return null;
    }

    private void kgy(com.bytedance.sdk.component.noq.ahm ahmVar, com.bytedance.sdk.component.noq.ahm.rz.noq noqVar, String str, byte[] bArr) {
        if (ahmVar == null || !ahmVar.noq()) {
            return;
        }
        noqVar.ahm(ahmVar).kgy(str, bArr);
    }
}
