package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2307Rs implements InterfaceC2389Uz {
    public static byte[] A03;
    public static String[] A04 = {"dheE", "Iwl2", "MEE4GexDrhsXhj", "D0RnELDLc4WQvimbBPbg52MLoCkd3U7O", "PyJuBTzi61xP0Rgs", "6HCI0jtPHoSOK2", "ApHe7VzdSKcwRAS0SKPKUFrd8tVtm3mv", "uvkaOnOj7C7QVT"};
    public InterfaceC2480Yv A00;
    public Q9 A01;
    public final InterfaceC2484Yz A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-120, 127, -62, -50, -44, -53, -61, 127, -47, -60, -64, -61, 127, -45, -57, -60, 127, -46, -45, -47, -60, -64, -52, -115, 108, -115, -116, -125, 62, -115, -124, 62, -110, -122, -125, 62, 127, -108, 127, -121, -118, 127, -128, -118, -125, 62, -125, -106, -110, -112, 127, -127, -110, -115, -112, -111, 62, 70};
    }

    static {
        A01();
    }

    public C2307Rs(InterfaceC2484Yz interfaceC2484Yz) {
        this.A02 = interfaceC2484Yz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2389Uz
    @MetaExoPlayerCustomization
    public final void A6X() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2389Uz
    public final long A8B() {
        if (this.A01 != null) {
            return this.A01.A9Q();
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC2389Uz
    public final void AAp(@MetaExoPlayerCustomization(" To be replaced with DataReader after upstream is updated") TE te, Uri uri, Map<String, List<String>> map, long j, long j2, InterfaceC2481Yw interfaceC2481Yw) throws IOException {
        C18348f c18348f = new C18348f(te, j, j2);
        this.A01 = c18348f;
        if (this.A00 != null) {
            return;
        }
        InterfaceC2480Yv[] extractors = this.A02.A5x(uri, map);
        if (extractors.length == 1) {
            this.A00 = extractors[0];
        } else {
            for (InterfaceC2480Yv interfaceC2480Yv : extractors) {
                try {
                    if (interfaceC2480Yv.ALN(c18348f)) {
                        this.A00 = interfaceC2480Yv;
                        AbstractC2159Ln.A08(this.A00 != null || c18348f.A9Q() == j);
                        c18348f.AK3();
                        break;
                    } else {
                        boolean z = this.A00 != null || c18348f.A9Q() == j;
                        AbstractC2159Ln.A08(z);
                        c18348f.AK3();
                    }
                } catch (EOFException unused) {
                    if (this.A00 != null || c18348f.A9Q() == j) {
                    }
                } catch (Throwable th) {
                    AbstractC2159Ln.A08(this.A00 != null || c18348f.A9Q() == j);
                    c18348f.AK3();
                    throw th;
                }
                AbstractC2159Ln.A08(z);
                c18348f.AK3();
            }
            if (this.A00 == null) {
                throw new RX(A00(24, 34, 26) + N1.A0s(extractors) + A00(0, 24, 91), (Uri) AbstractC2159Ln.A01(uri));
            }
        }
        InterfaceC2480Yv interfaceC2480Yv2 = this.A00;
        String[] strArr = A04;
        if (strArr[2].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A04[3] = "Ll15BA8YIA3F8MXDjYKO5u7HXF1WnxP9";
        interfaceC2480Yv2.AAq(interfaceC2481Yw);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2389Uz
    public final int AIZ(ZH zh) throws IOException {
        return ((InterfaceC2480Yv) AbstractC2159Ln.A01(this.A00)).AIY((Q9) AbstractC2159Ln.A01(this.A01), zh);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2389Uz
    public final void AIp() {
        if (this.A00 != null) {
            this.A00.AIp();
            String[] strArr = A04;
            if (strArr[2].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "PSKkZCh97ktz0s4q";
            strArr2[5] = "8E6IFM17kqru9U";
            this.A00 = null;
        }
        this.A01 = null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2389Uz
    public final void AKO(long j, long j2) {
        ((InterfaceC2480Yv) AbstractC2159Ln.A01(this.A00)).AKO(j, j2);
    }
}
