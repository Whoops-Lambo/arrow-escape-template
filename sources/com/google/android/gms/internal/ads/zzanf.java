package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzanf {
    public final boolean a;
    public final String b;
    public final zzahz c;
    public final int d;
    public final byte[] e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public zzanf(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        boolean z2;
        int i4 = 1;
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzgvz.a((bArr2 == null) ^ z2);
        this.a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (str.equals("cbc1")) {
                        i4 = 2;
                    } else {
                        StringBuilder sb = new StringBuilder(str.length() + 68);
                        sb.append("Unsupported protection scheme type '");
                        sb.append(str);
                        sb.append("'. Assuming AES-CTR crypto mode.");
                        zzeh.c("TrackEncryptionBox", sb.toString());
                    }
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        i4 = 2;
                    } else {
                        StringBuilder sb2 = new StringBuilder(str.length() + 68);
                        sb2.append("Unsupported protection scheme type '");
                        sb2.append(str);
                        sb2.append("'. Assuming AES-CTR crypto mode.");
                        zzeh.c("TrackEncryptionBox", sb2.toString());
                    }
                    break;
                case 3049879:
                    if (!str.equals("cenc")) {
                        StringBuilder sb3 = new StringBuilder(str.length() + 68);
                        sb3.append("Unsupported protection scheme type '");
                        sb3.append(str);
                        sb3.append("'. Assuming AES-CTR crypto mode.");
                        zzeh.c("TrackEncryptionBox", sb3.toString());
                    }
                    break;
                case 3049895:
                    if (!str.equals("cens")) {
                        StringBuilder sb4 = new StringBuilder(str.length() + 68);
                        sb4.append("Unsupported protection scheme type '");
                        sb4.append(str);
                        sb4.append("'. Assuming AES-CTR crypto mode.");
                        zzeh.c("TrackEncryptionBox", sb4.toString());
                    }
                    break;
                default:
                    StringBuilder sb5 = new StringBuilder(str.length() + 68);
                    sb5.append("Unsupported protection scheme type '");
                    sb5.append(str);
                    sb5.append("'. Assuming AES-CTR crypto mode.");
                    zzeh.c("TrackEncryptionBox", sb5.toString());
                    break;
            }
        }
        this.c = new zzahz(i4, bArr, i2, i3);
    }
}
