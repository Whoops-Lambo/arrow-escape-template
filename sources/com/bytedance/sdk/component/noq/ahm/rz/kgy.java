package com.bytedance.sdk.component.noq.ahm.rz;

import com.bytedance.sdk.component.noq.dg;
import com.bytedance.sdk.component.noq.fpp;
import com.bytedance.sdk.component.noq.nu;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class kgy<T> {
    private fpp ahm;
    private rz kgy;

    public void kgy(nu<T> nuVar) {
        try {
            fpp fppVar = this.ahm;
            if (fppVar != null) {
                fppVar.kgy("success", this.kgy);
            }
            String strFpp = this.kgy.fpp();
            Map<String, List<rz>> mapGf = this.kgy.dg().gf();
            List<rz> list = mapGf.get(strFpp);
            if (list == null) {
                dg dgVarNoq = this.kgy.noq();
                if (dgVarNoq != null) {
                    dgVarNoq.toString();
                    this.kgy.fi();
                    dgVarNoq.kgy(nuVar);
                }
            } else {
                synchronized (list) {
                    try {
                        list.size();
                        for (rz rzVar : list) {
                            dg dgVarNoq2 = rzVar.noq();
                            if (dgVarNoq2 != null) {
                                dgVarNoq2.toString();
                                rzVar.fi();
                                dgVarNoq2.kgy(nuVar);
                            }
                        }
                        list.clear();
                        mapGf.remove(strFpp);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            fpp fppVar2 = this.ahm;
            if (fppVar2 != null) {
                fppVar2.ahm("success", this.kgy);
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pVw==", "a88KpwavfMuUadZRgBOhK1A=", "VOAegAC/bNST", 57);
        }
    }

    public kgy(rz rzVar, fpp fppVar) {
        this.kgy = rzVar;
        this.ahm = fppVar;
    }

    public void kgy(int i, String str, Throwable th) {
        try {
            fpp fppVar = this.ahm;
            if (fppVar != null) {
                fppVar.kgy("failed", this.kgy);
            }
            String strFpp = this.kgy.fpp();
            Map<String, List<rz>> mapGf = this.kgy.dg().gf();
            List<rz> list = mapGf.get(strFpp);
            if (list == null) {
                dg dgVarNoq = this.kgy.noq();
                if (dgVarNoq != null) {
                    dgVarNoq.kgy(i, str, th);
                }
            } else {
                synchronized (list) {
                    try {
                        Iterator<rz> it = list.iterator();
                        while (it.hasNext()) {
                            dg dgVarNoq2 = it.next().noq();
                            if (dgVarNoq2 != null) {
                                dgVarNoq2.toString();
                                dgVarNoq2.kgy(i, str, th);
                            }
                        }
                        list.clear();
                        mapGf.remove(strFpp);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            fpp fppVar2 = this.ahm;
            if (fppVar2 != null) {
                fppVar2.ahm("failed", this.kgy);
            }
        } catch (Throwable th3) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th3, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE4UcoS9eoD2UDbtlws5D2UmJA64pVw==", "a88KpwavfMuUadZRgBOhK1A=", "VOALlAqwbMM=", 94);
        }
    }
}
