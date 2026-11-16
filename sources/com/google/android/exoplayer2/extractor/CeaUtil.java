package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class CeaUtil {
    private static final int COUNTRY_CODE = 181;
    private static final int PAYLOAD_TYPE_CC = 4;
    private static final int PROVIDER_CODE_ATSC = 49;
    private static final int PROVIDER_CODE_DIRECTV = 47;
    private static final String TAG = "CeaUtil";
    public static final int USER_DATA_IDENTIFIER_GA94 = 1195456820;
    public static final int USER_DATA_TYPE_CODE_MPEG_CC = 3;

    private static int readNon255TerminatedValue(ParsableByteArray parsableByteArray) {
        int i = 0;
        while (parsableByteArray.bytesLeft() != 0) {
            int unsignedByte = parsableByteArray.readUnsignedByte();
            i += unsignedByte;
            if (unsignedByte != 255) {
                return i;
            }
        }
        return -1;
    }

    private CeaUtil() {
    }

    public static void consume(long j, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        int i;
        boolean z;
        while (true) {
            boolean z2 = true;
            if (parsableByteArray.bytesLeft() > 1) {
                int non255TerminatedValue = readNon255TerminatedValue(parsableByteArray);
                int non255TerminatedValue2 = readNon255TerminatedValue(parsableByteArray);
                int position = parsableByteArray.getPosition() + non255TerminatedValue2;
                if (non255TerminatedValue2 != -1 && non255TerminatedValue2 <= parsableByteArray.bytesLeft()) {
                    if (non255TerminatedValue == 4 && non255TerminatedValue2 >= 8) {
                        int unsignedByte = parsableByteArray.readUnsignedByte();
                        int unsignedShort = parsableByteArray.readUnsignedShort();
                        if (unsignedShort == 49) {
                            i = parsableByteArray.readInt();
                        } else {
                            i = 0;
                        }
                        int unsignedByte2 = parsableByteArray.readUnsignedByte();
                        if (unsignedShort == 47) {
                            parsableByteArray.skipBytes(1);
                        }
                        if (unsignedByte == COUNTRY_CODE && ((unsignedShort == 49 || unsignedShort == 47) && unsignedByte2 == 3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (unsignedShort == 49) {
                            if (i != 1195456820) {
                                z2 = false;
                            }
                            z &= z2;
                        }
                        if (z) {
                            consumeCcData(j, parsableByteArray, trackOutputArr);
                        }
                    }
                } else {
                    Log.w(TAG, "Skipping remainder of malformed SEI NAL unit.");
                    position = parsableByteArray.limit();
                }
                parsableByteArray.setPosition(position);
            } else {
                return;
            }
        }
    }

    public static void consumeCcData(long j, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        long j2;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(1);
            int i = (unsignedByte & 31) * 3;
            int position = parsableByteArray.getPosition();
            int length = trackOutputArr.length;
            int i2 = 0;
            while (i2 < length) {
                TrackOutput trackOutput = trackOutputArr[i2];
                parsableByteArray.setPosition(position);
                trackOutput.sampleData(parsableByteArray, i);
                if (j != -9223372036854775807L) {
                    j2 = j;
                    trackOutput.sampleMetadata(j2, 1, i, 0, null);
                } else {
                    j2 = j;
                }
                i2++;
                j = j2;
            }
        }
    }
}
