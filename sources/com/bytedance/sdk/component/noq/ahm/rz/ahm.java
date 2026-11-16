package com.bytedance.sdk.component.noq.ahm.rz;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.noq.ra;
import com.bytedance.sdk.component.noq.twf;
import com.bytedance.sdk.component.noq.um;
import com.bytedance.sdk.component.noq.vs;
import com.bytedance.sdk.component.utils.dg;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ahm implements vs {
    private volatile noq kgy;

    private void ahm(Context context, twf twfVar) {
        if (this.kgy != null) {
            Log.w("ImageLoader", "already init!");
        }
        if (twfVar == null) {
            twfVar = ct.kgy(context);
        }
        this.kgy = new noq(context, twfVar);
    }

    @Override // com.bytedance.sdk.component.noq.vs
    public InputStream kgy(String str, String str2) {
        byte[] bArrKgy;
        if (this.kgy != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = dg.kgy(str);
            }
            um umVarRz = this.kgy.rz();
            if (umVarRz != null && (bArrKgy = umVarRz.kgy(str2)) != null) {
                return new ByteArrayInputStream(bArrKgy);
            }
            Collection<com.bytedance.sdk.component.noq.rz> collectionUq = this.kgy.uq();
            if (collectionUq != null) {
                Iterator<com.bytedance.sdk.component.noq.rz> it = collectionUq.iterator();
                while (it.hasNext()) {
                    InputStream inputStreamKgy = it.next().kgy(str2);
                    if (inputStreamKgy != null) {
                        return inputStreamKgy;
                    }
                }
            }
        }
        return null;
    }

    private ahm() {
    }

    @Override // com.bytedance.sdk.component.noq.vs
    public ra kgy(String str) {
        return new rz.ahm(this.kgy).rz(str);
    }

    public static vs kgy(Context context, twf twfVar) {
        ahm ahmVar = new ahm();
        ahmVar.ahm(context, twfVar);
        return ahmVar;
    }

    @Override // com.bytedance.sdk.component.noq.vs
    public boolean kgy(String str, String str2, String str3) {
        if (this.kgy == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = dg.kgy(str);
        }
        com.bytedance.sdk.component.noq.rz rzVarKgy = this.kgy.kgy(str3);
        if (rzVarKgy != null) {
            return rzVarKgy.ahm(str2);
        }
        return false;
    }
}
