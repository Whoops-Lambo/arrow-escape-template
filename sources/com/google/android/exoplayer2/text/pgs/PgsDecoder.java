package com.google.android.exoplayer2.text.pgs;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import defpackage.ku1;
import defpackage.tp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class PgsDecoder extends SimpleSubtitleDecoder {
    private static final byte INFLATE_HEADER = 120;
    private static final int SECTION_TYPE_BITMAP_PICTURE = 21;
    private static final int SECTION_TYPE_END = 128;
    private static final int SECTION_TYPE_IDENTIFIER = 22;
    private static final int SECTION_TYPE_PALETTE = 20;
    private final ParsableByteArray buffer;
    private final ku1 cueBuilder;
    private final ParsableByteArray inflatedBuffer;

    @Nullable
    private Inflater inflater;

    public PgsDecoder() {
        super("PgsDecoder");
        this.buffer = new ParsableByteArray();
        this.inflatedBuffer = new ParsableByteArray();
        this.cueBuilder = new ku1();
    }

    @Nullable
    private static Cue readNextSection(ParsableByteArray parsableByteArray, ku1 ku1Var) {
        Cue cueBuild;
        int unsignedByte;
        int position;
        int iLimit;
        int unsignedInt24;
        int iLimit2 = parsableByteArray.limit();
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int position2 = parsableByteArray.getPosition() + unsignedShort;
        if (position2 > iLimit2) {
            parsableByteArray.setPosition(iLimit2);
            return null;
        }
        int i = 128;
        if (unsignedByte2 != 128) {
            switch (unsignedByte2) {
                case 20:
                    int[] iArr = ku1Var.b;
                    if (unsignedShort % 5 == 2) {
                        parsableByteArray.skipBytes(2);
                        Arrays.fill(iArr, 0);
                        int i2 = unsignedShort / 5;
                        int i3 = 0;
                        while (i3 < i2) {
                            int unsignedByte3 = parsableByteArray.readUnsignedByte();
                            int i4 = i;
                            double unsignedByte4 = parsableByteArray.readUnsignedByte();
                            double unsignedByte5 = parsableByteArray.readUnsignedByte() - i4;
                            int[] iArr2 = iArr;
                            double unsignedByte6 = parsableByteArray.readUnsignedByte() - i4;
                            iArr2[unsignedByte3] = Util.constrainValue((int) ((unsignedByte6 * 1.772d) + unsignedByte4), 0, 255) | (parsableByteArray.readUnsignedByte() << 24) | (Util.constrainValue((int) ((1.402d * unsignedByte5) + unsignedByte4), 0, 255) << 16) | (Util.constrainValue((int) ((unsignedByte4 - (0.34414d * unsignedByte6)) - (unsignedByte5 * 0.71414d)), 0, 255) << 8);
                            i3++;
                            i = i4;
                            iArr = iArr2;
                        }
                        ku1Var.c = true;
                    }
                    break;
                case 21:
                    ParsableByteArray parsableByteArray2 = ku1Var.a;
                    if (unsignedShort >= 4) {
                        parsableByteArray.skipBytes(3);
                        int i5 = unsignedShort - 4;
                        if (!((128 & parsableByteArray.readUnsignedByte()) != 0)) {
                            position = parsableByteArray2.getPosition();
                            iLimit = parsableByteArray2.limit();
                            if (position < iLimit && i5 > 0) {
                                int iMin = Math.min(i5, iLimit - position);
                                parsableByteArray.readBytes(parsableByteArray2.getData(), position, iMin);
                                parsableByteArray2.setPosition(position + iMin);
                            }
                        } else if (i5 >= 7 && (unsignedInt24 = parsableByteArray.readUnsignedInt24()) >= 4) {
                            ku1Var.h = parsableByteArray.readUnsignedShort();
                            ku1Var.i = parsableByteArray.readUnsignedShort();
                            parsableByteArray2.reset(unsignedInt24 - 4);
                            i5 = unsignedShort - 11;
                            position = parsableByteArray2.getPosition();
                            iLimit = parsableByteArray2.limit();
                            if (position < iLimit) {
                                int iMin2 = Math.min(i5, iLimit - position);
                                parsableByteArray.readBytes(parsableByteArray2.getData(), position, iMin2);
                                parsableByteArray2.setPosition(position + iMin2);
                            }
                        }
                    }
                    break;
                case 22:
                    ku1Var.getClass();
                    if (unsignedShort >= 19) {
                        ku1Var.d = parsableByteArray.readUnsignedShort();
                        ku1Var.e = parsableByteArray.readUnsignedShort();
                        parsableByteArray.skipBytes(11);
                        ku1Var.f = parsableByteArray.readUnsignedShort();
                        ku1Var.g = parsableByteArray.readUnsignedShort();
                    }
                    break;
            }
            cueBuild = null;
        } else {
            int[] iArr3 = ku1Var.b;
            ParsableByteArray parsableByteArray3 = ku1Var.a;
            if (ku1Var.d == 0 || ku1Var.e == 0 || ku1Var.h == 0 || ku1Var.i == 0 || parsableByteArray3.limit() == 0 || parsableByteArray3.getPosition() != parsableByteArray3.limit() || !ku1Var.c) {
                cueBuild = null;
            } else {
                parsableByteArray3.setPosition(0);
                int i6 = ku1Var.h * ku1Var.i;
                int[] iArr4 = new int[i6];
                int i7 = 0;
                while (i7 < i6) {
                    int unsignedByte7 = parsableByteArray3.readUnsignedByte();
                    if (unsignedByte7 != 0) {
                        unsignedByte = i7 + 1;
                        iArr4[i7] = iArr3[unsignedByte7];
                    } else {
                        int unsignedByte8 = parsableByteArray3.readUnsignedByte();
                        if (unsignedByte8 != 0) {
                            unsignedByte = ((unsignedByte8 & 64) == 0 ? unsignedByte8 & 63 : ((unsignedByte8 & 63) << 8) | parsableByteArray3.readUnsignedByte()) + i7;
                            Arrays.fill(iArr4, i7, unsignedByte, (unsignedByte8 & 128) == 0 ? 0 : iArr3[parsableByteArray3.readUnsignedByte()]);
                        }
                    }
                    i7 = unsignedByte;
                }
                cueBuild = new Cue.Builder().setBitmap(Bitmap.createBitmap(iArr4, ku1Var.h, ku1Var.i, Bitmap.Config.ARGB_8888)).setPosition(ku1Var.f / ku1Var.d).setPositionAnchor(0).setLine(ku1Var.g / ku1Var.e, 0).setLineAnchor(0).setSize(ku1Var.h / ku1Var.d).setBitmapHeight(ku1Var.i / ku1Var.e).build();
            }
            ku1Var.d = 0;
            ku1Var.e = 0;
            ku1Var.f = 0;
            ku1Var.g = 0;
            ku1Var.h = 0;
            ku1Var.i = 0;
            parsableByteArray3.reset(0);
            ku1Var.c = false;
        }
        parsableByteArray.setPosition(position2);
        return cueBuild;
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public Subtitle decode(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        this.buffer.reset(bArr, i);
        maybeInflateData(this.buffer);
        ku1 ku1Var = this.cueBuilder;
        ku1Var.d = 0;
        ku1Var.e = 0;
        ku1Var.f = 0;
        ku1Var.g = 0;
        ku1Var.h = 0;
        ku1Var.i = 0;
        ku1Var.a.reset(0);
        ku1Var.c = false;
        ArrayList arrayList = new ArrayList();
        while (this.buffer.bytesLeft() >= 3) {
            Cue nextSection = readNextSection(this.buffer, this.cueBuilder);
            if (nextSection != null) {
                arrayList.add(nextSection);
            }
        }
        return new tp(Collections.unmodifiableList(arrayList), 3);
    }

    private void maybeInflateData(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() > 0 && parsableByteArray.peekUnsignedByte() == 120) {
            if (this.inflater == null) {
                this.inflater = new Inflater();
            }
            if (Util.inflate(parsableByteArray, this.inflatedBuffer, this.inflater)) {
                parsableByteArray.reset(this.inflatedBuffer.getData(), this.inflatedBuffer.limit());
            }
        }
    }
}
