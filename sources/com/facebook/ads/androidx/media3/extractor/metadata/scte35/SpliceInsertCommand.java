package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C2181Mk;
import com.facebook.ads.redexgen.X.C2189Ms;
import com.facebook.ads.redexgen.X.C2528aI;
import com.facebook.ads.redexgen.X.C2529aJ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static String[] A0D = {"bQjU", "lDOOg9IOKycthmf3moi8TWpc", "mq8taTyObxEnETGJK2snRsGGUnFN", "tHlzPpr4jJ1ZDU", "2ZBX7AdMaENlXNaVwRncxy7CKdlVjwqp", "5mUBmesNVC8eBzYCNPYtJGFmIZEY", "z3qhQV", "J3XiIOF3cceaw5H1"};
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new C2528aI();
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List<C2529aJ> A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 27 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C2529aJ> list, boolean z5, long j4, int i, int i2, int i3) {
        this.A06 = j;
        this.A0B = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A0C = z4;
        this.A05 = j2;
        this.A04 = j3;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z5;
        this.A03 = j4;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.A06 = parcel.readLong();
        this.A0B = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        this.A0A = parcel.readByte() == 1;
        this.A0C = parcel.readByte() == 1;
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(C2529aJ.A00(parcel));
        }
        this.A07 = Collections.unmodifiableList(arrayList);
        int componentSpliceListSize = parcel.readByte();
        this.A08 = componentSpliceListSize == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListSize2 = parcel.readInt();
        this.A02 = componentSpliceListSize2;
        int componentSpliceListSize3 = parcel.readInt();
        this.A00 = componentSpliceListSize3;
        int componentSpliceListSize4 = parcel.readInt();
        this.A01 = componentSpliceListSize4;
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, C2528aI c2528aI) {
        this(parcel);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    public static SpliceInsertCommand A00(C2181Mk c2181Mk, long j, C2189Ms c2189Ms) {
        long jA0Q = c2181Mk.A0Q();
        boolean z = (c2181Mk.A0I() & 128) != 0;
        boolean z2 = false;
        boolean outOfNetworkIndicator = false;
        boolean z3 = false;
        long jA00 = -9223372036854775807L;
        List listEmptyList = Collections.emptyList();
        int iA0M = 0;
        int iA0I = 0;
        int iA0I2 = 0;
        boolean z4 = false;
        long jA0Q2 = -9223372036854775807L;
        if (!z) {
            int iA0I3 = c2181Mk.A0I();
            String[] strArr = A0D;
            if (strArr[6].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A0D[1] = "TYWB5U4XEobqurYG6LzX57FR";
            z2 = (iA0I3 & 128) != 0;
            outOfNetworkIndicator = (iA0I3 & 64) != 0;
            boolean autoReturn = (iA0I3 & 32) != 0;
            z3 = (iA0I3 & 16) != 0;
            if (A0D[3].length() != 17) {
                A0D[1] = "4O0buXygssTTRhmDywTA31Dw";
                if (outOfNetworkIndicator) {
                    if (!z3) {
                        jA00 = TimeSignalCommand.A00(c2181Mk, j);
                    }
                }
            } else if (outOfNetworkIndicator) {
                if (!z3) {
                    jA00 = TimeSignalCommand.A00(c2181Mk, j);
                }
            }
            if (!outOfNetworkIndicator) {
                int componentCount = c2181Mk.A0I();
                listEmptyList = new ArrayList(componentCount);
                for (int i = 0; i < componentCount; i++) {
                    int componentTag = c2181Mk.A0I();
                    long jA01 = -9223372036854775807L;
                    if (!z3) {
                        jA01 = TimeSignalCommand.A00(c2181Mk, j);
                    }
                    listEmptyList.add(new C2529aJ(componentTag, jA01, c2189Ms.A06(jA01), null));
                }
            }
            if (autoReturn) {
                long jA0I = c2181Mk.A0I();
                z4 = (jA0I & 128) != 0;
                jA0Q2 = (1000 * (((jA0I & 1) << 32) | c2181Mk.A0Q())) / 90;
            }
            iA0M = c2181Mk.A0M();
            iA0I = c2181Mk.A0I();
            iA0I2 = c2181Mk.A0I();
        }
        return new SpliceInsertCommand(jA0Q, z, z2, outOfNetworkIndicator, z3, jA00, c2189Ms.A06(jA00), listEmptyList, z4, jA0Q2, iA0M, iA0I, iA0I2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        int size = this.A07.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.A07.get(i2).A01(parcel);
        }
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
