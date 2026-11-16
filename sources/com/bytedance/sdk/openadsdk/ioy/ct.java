package com.bytedance.sdk.openadsdk.ioy;

import io.p071bidmachine.media3.extractor.ts.y;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class ct {
    private static final List<CharsetEncoder> ahm = new ArrayList();
    static final /* synthetic */ boolean kgy = true;
    private final CharsetEncoder[] rz;
    private final int uq;

    public int ahm(int i) {
        return uq.kgy(this.rz[i].charset()).kgy();
    }

    public boolean kgy(char c, int i) {
        if (kgy || i < kgy()) {
            return this.rz[i].canEncode(String.valueOf(c));
        }
        y.o();
        return false;
    }

    public ct(String str, Charset charset, int i) {
        boolean z;
        int i2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StandardCharsets.ISO_8859_1.newEncoder());
        if (charset != null && charset.name().startsWith("UTF")) {
            z = true;
        } else {
            z = false;
        }
        for (int i3 = 0; i3 < str.length(); i3++) {
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    CharsetEncoder charsetEncoder = (CharsetEncoder) obj;
                    char cCharAt = str.charAt(i3);
                    if (cCharAt == i || charsetEncoder.canEncode(cCharAt)) {
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                for (CharsetEncoder charsetEncoder2 : ahm) {
                    if (charsetEncoder2.canEncode(str.charAt(i3))) {
                        arrayList.add(charsetEncoder2);
                        z2 = true;
                        break;
                    }
                }
            }
            if (!z2) {
                z = true;
            }
        }
        if (arrayList.size() == 1 && !z) {
            this.rz = new CharsetEncoder[]{(CharsetEncoder) arrayList.get(0)};
        } else {
            this.rz = new CharsetEncoder[arrayList.size() + 2];
            int size2 = arrayList.size();
            int i5 = 0;
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = arrayList.get(i6);
                i6++;
                this.rz[i5] = (CharsetEncoder) obj2;
                i5++;
            }
            this.rz[i5] = StandardCharsets.UTF_8.newEncoder();
            this.rz[i5 + 1] = StandardCharsets.UTF_16BE.newEncoder();
        }
        if (charset != null) {
            i2 = 0;
            while (true) {
                CharsetEncoder[] charsetEncoderArr = this.rz;
                if (i2 < charsetEncoderArr.length) {
                    if (charsetEncoderArr[i2] != null && charset.name().equals(this.rz[i2].charset().name())) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
        } else {
            i2 = -1;
            break;
        }
        this.uq = i2;
        if (!kgy && !this.rz[0].charset().equals(StandardCharsets.ISO_8859_1)) {
            y.o();
            throw null;
        }
    }

    public int ahm() {
        return this.uq;
    }

    public Charset kgy(int i) {
        if (kgy || i < kgy()) {
            return this.rz[i].charset();
        }
        y.o();
        return null;
    }

    public int kgy() {
        return this.rz.length;
    }

    public byte[] kgy(String str, int i) {
        if (kgy || i < kgy()) {
            return str.getBytes(this.rz[i].charset());
        }
        y.o();
        return null;
    }
}
