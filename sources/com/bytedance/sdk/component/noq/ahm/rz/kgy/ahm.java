package com.bytedance.sdk.component.noq.ahm.rz.kgy;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ahm implements com.bytedance.sdk.component.noq.ahm, Cloneable {
    private static volatile com.bytedance.sdk.component.noq.ahm gf;
    private int ahm;
    private boolean ct;
    private File fi;
    private long kgy;
    private boolean noq;
    private int rz;
    private int uq;
    private boolean yo;

    public ahm(int i, int i2, int i3, long j, File file) {
        this(i, i2, i3, j, i2 != 0, j != 0, file);
    }

    public static com.bytedance.sdk.component.noq.ahm gf() {
        return gf;
    }

    @Override // com.bytedance.sdk.component.noq.ahm
    public int ahm() {
        return this.ahm;
    }

    @Override // com.bytedance.sdk.component.noq.ahm
    public boolean ct() {
        return this.ct;
    }

    @Override // com.bytedance.sdk.component.noq.ahm
    public File fi() {
        return this.fi;
    }

    @Override // com.bytedance.sdk.component.noq.ahm
    public boolean noq() {
        return this.yo;
    }

    @Override // com.bytedance.sdk.component.noq.ahm
    public int rz() {
        return this.rz;
    }

    @Override // com.bytedance.sdk.component.noq.ahm
    public int uq() {
        return this.uq;
    }

    @Override // com.bytedance.sdk.component.noq.ahm
    public boolean yo() {
        return this.noq;
    }

    public static com.bytedance.sdk.component.noq.ahm kgy(File file) {
        long jKgy;
        int iRz;
        int iUq;
        file.mkdirs();
        if (gf == null) {
            iRz = 10;
            iUq = 14;
            jKgy = 20;
        } else {
            jKgy = gf.kgy();
            iRz = gf.rz();
            iUq = gf.uq();
        }
        return new ahm(0, iRz, iUq, jKgy, file);
    }

    public ahm(int i, int i2, int i3, long j, boolean z, boolean z2, File file) {
        this.kgy = j;
        this.ahm = i;
        this.rz = i2;
        this.uq = i3;
        this.ct = z;
        this.noq = z2;
        this.fi = file;
        this.yo = i3 != 0;
    }

    public static void kgy(Context context, com.bytedance.sdk.component.noq.ahm ahmVar) {
        if (ahmVar != null) {
            gf = ahmVar;
        } else {
            gf = kgy(new File(context.getCacheDir(), "image"));
        }
    }

    @Override // com.bytedance.sdk.component.noq.ahm
    public long kgy() {
        return this.kgy;
    }
}
