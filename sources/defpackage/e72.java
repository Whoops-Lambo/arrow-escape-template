package defpackage;

import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.Allocation;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e72 {
    public final Allocator a;
    public final int b;
    public final ParsableByteArray c;
    public d72 d;
    public d72 e;
    public d72 f;
    public long g;

    public static d72 c(d72 d72Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= d72Var.b) {
            d72Var = d72Var.d;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (d72Var.b - j));
            Allocation allocation = d72Var.c;
            byteBuffer.put(allocation.data, ((int) (j - d72Var.a)) + allocation.offset, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == d72Var.b) {
                d72Var = d72Var.d;
            }
        }
        return d72Var;
    }

    public static d72 d(d72 d72Var, long j, byte[] bArr, int i) {
        while (j >= d72Var.b) {
            d72Var = d72Var.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (d72Var.b - j));
            Allocation allocation = d72Var.c;
            System.arraycopy(allocation.data, ((int) (j - d72Var.a)) + allocation.offset, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == d72Var.b) {
                d72Var = d72Var.d;
            }
        }
        return d72Var;
    }

    public static d72 e(d72 d72Var, DecoderInputBuffer decoderInputBuffer, f72 f72Var, ParsableByteArray parsableByteArray) {
        d72 d72VarD;
        if (decoderInputBuffer.isEncrypted()) {
            long j = f72Var.b;
            int unsignedShort = 1;
            parsableByteArray.reset(1);
            d72 d72VarD2 = d(d72Var, j, parsableByteArray.getData(), 1);
            long j2 = j + 1;
            byte b = parsableByteArray.getData()[0];
            boolean z = (b & 128) != 0;
            int i = b & 127;
            CryptoInfo cryptoInfo = decoderInputBuffer.cryptoInfo;
            byte[] bArr = cryptoInfo.iv;
            if (bArr == null) {
                cryptoInfo.iv = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            d72VarD = d(d72VarD2, j2, cryptoInfo.iv, i);
            long j3 = j2 + ((long) i);
            if (z) {
                parsableByteArray.reset(2);
                d72VarD = d(d72VarD, j3, parsableByteArray.getData(), 2);
                j3 += 2;
                unsignedShort = parsableByteArray.readUnsignedShort();
            }
            int i2 = unsignedShort;
            int[] iArr = cryptoInfo.numBytesOfClearData;
            if (iArr == null || iArr.length < i2) {
                iArr = new int[i2];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr3 == null || iArr3.length < i2) {
                iArr3 = new int[i2];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i3 = i2 * 6;
                parsableByteArray.reset(i3);
                d72VarD = d(d72VarD, j3, parsableByteArray.getData(), i3);
                j3 += (long) i3;
                parsableByteArray.setPosition(0);
                for (int i4 = 0; i4 < i2; i4++) {
                    iArr2[i4] = parsableByteArray.readUnsignedShort();
                    iArr4[i4] = parsableByteArray.readUnsignedIntToInt();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = f72Var.a - ((int) (j3 - f72Var.b));
            }
            TrackOutput.CryptoData cryptoData = (TrackOutput.CryptoData) Util.castNonNull(f72Var.c);
            cryptoInfo.set(i2, iArr2, iArr4, cryptoData.encryptionKey, cryptoInfo.iv, cryptoData.cryptoMode, cryptoData.encryptedBlocks, cryptoData.clearBlocks);
            long j4 = f72Var.b;
            int i5 = (int) (j3 - j4);
            f72Var.b = j4 + ((long) i5);
            f72Var.a -= i5;
        } else {
            d72VarD = d72Var;
        }
        if (!decoderInputBuffer.hasSupplementalData()) {
            decoderInputBuffer.ensureSpaceForWrite(f72Var.a);
            return c(d72VarD, f72Var.b, decoderInputBuffer.data, f72Var.a);
        }
        parsableByteArray.reset(4);
        d72 d72VarD3 = d(d72VarD, f72Var.b, parsableByteArray.getData(), 4);
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        f72Var.b += 4;
        f72Var.a -= 4;
        decoderInputBuffer.ensureSpaceForWrite(unsignedIntToInt);
        d72 d72VarC = c(d72VarD3, f72Var.b, decoderInputBuffer.data, unsignedIntToInt);
        f72Var.b += (long) unsignedIntToInt;
        int i6 = f72Var.a - unsignedIntToInt;
        f72Var.a = i6;
        decoderInputBuffer.resetSupplementalData(i6);
        return c(d72VarC, f72Var.b, decoderInputBuffer.supplementalData, f72Var.a);
    }

    public final void a(long j) {
        d72 d72Var;
        if (j == -1) {
            return;
        }
        while (true) {
            d72Var = this.d;
            if (j < d72Var.b) {
                break;
            }
            this.a.release(d72Var.c);
            d72 d72Var2 = this.d;
            d72Var2.c = null;
            d72 d72Var3 = d72Var2.d;
            d72Var2.d = null;
            this.d = d72Var3;
        }
        if (this.e.a < d72Var.a) {
            this.e = d72Var;
        }
    }

    public final int b(int i) {
        d72 d72Var = this.f;
        if (d72Var.c == null) {
            Allocation allocationAllocate = this.a.allocate();
            d72 d72Var2 = new d72(this.f.b, this.b);
            d72Var.c = allocationAllocate;
            d72Var.d = d72Var2;
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }

    public e72(Allocator allocator) {
        this.a = allocator;
        int individualAllocationLength = allocator.getIndividualAllocationLength();
        this.b = individualAllocationLength;
        this.c = new ParsableByteArray(32);
        d72 d72Var = new d72(0L, individualAllocationLength);
        this.d = d72Var;
        this.e = d72Var;
        this.f = d72Var;
    }
}
