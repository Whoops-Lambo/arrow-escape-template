package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.container.Mp4Box;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.h50;
import defpackage.pv1;
import defpackage.w02;
import defpackage.y9;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class PsshAtomUtil {
    private static final String TAG = "PsshAtomUtil";

    public static byte[] buildPsshAtom(UUID uuid, @Nullable UUID[] uuidArr, @Nullable byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length = pv1.v(uuidArr.length, 16, 4, length);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(Mp4Box.TYPE_pssh);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    @Nullable
    private static w02 parsePsshAtom(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        if (parsableByteArray.limit() >= 32) {
            parsableByteArray.setPosition(0);
            if (parsableByteArray.readInt() == parsableByteArray.bytesLeft() + 4 && parsableByteArray.readInt() == 1886614376) {
                int iE = y9.e(parsableByteArray.readInt());
                if (iE > 1) {
                    h50.t(iE, "Unsupported pssh version: ", TAG);
                    return null;
                }
                UUID uuid = new UUID(parsableByteArray.readLong(), parsableByteArray.readLong());
                if (iE == 1) {
                    parsableByteArray.skipBytes(parsableByteArray.readUnsignedIntToInt() * 16);
                }
                int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
                if (unsignedIntToInt == parsableByteArray.bytesLeft()) {
                    byte[] bArr2 = new byte[unsignedIntToInt];
                    parsableByteArray.readBytes(bArr2, 0, unsignedIntToInt);
                    return new w02(uuid, iE, bArr2);
                }
            }
        }
        return null;
    }

    private PsshAtomUtil() {
    }

    public static boolean isPsshAtom(byte[] bArr) {
        if (parsePsshAtom(bArr) != null) {
            return true;
        }
        return false;
    }

    @Nullable
    public static byte[] parseSchemeSpecificData(byte[] bArr, UUID uuid) {
        w02 psshAtom = parsePsshAtom(bArr);
        if (psshAtom == null) {
            return null;
        }
        UUID uuid2 = psshAtom.a;
        if (!uuid.equals(uuid2)) {
            Log.w(TAG, "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + UserDetailsUtils.UserDetailsLiterals.DOT);
            return null;
        }
        return psshAtom.c;
    }

    @Nullable
    public static UUID parseUuid(byte[] bArr) {
        w02 psshAtom = parsePsshAtom(bArr);
        if (psshAtom == null) {
            return null;
        }
        return psshAtom.a;
    }

    public static int parseVersion(byte[] bArr) {
        w02 psshAtom = parsePsshAtom(bArr);
        if (psshAtom == null) {
            return -1;
        }
        return psshAtom.b;
    }

    public static byte[] buildPsshAtom(UUID uuid, @Nullable byte[] bArr) {
        return buildPsshAtom(uuid, null, bArr);
    }
}
