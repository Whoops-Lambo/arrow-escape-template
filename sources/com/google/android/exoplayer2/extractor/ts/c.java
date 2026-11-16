package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.CeaUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    public final List a;
    public final TrackOutput[] b;

    public final void b(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        int i = 0;
        while (true) {
            TrackOutput[] trackOutputArr = this.b;
            if (i >= trackOutputArr.length) {
                return;
            }
            trackIdGenerator.generateNewId();
            TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 3);
            Format format = (Format) this.a.get(i);
            String str = format.sampleMimeType;
            Assertions.checkArgument("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            trackOutputTrack.format(new Format.Builder().setId(trackIdGenerator.getFormatId()).setSampleMimeType(str).setSelectionFlags(format.selectionFlags).setLanguage(format.language).setAccessibilityChannel(format.accessibilityChannel).setInitializationData(format.initializationData).build());
            trackOutputArr[i] = trackOutputTrack;
            i++;
        }
    }

    public c(List list) {
        this.a = list;
        this.b = new TrackOutput[list.size()];
    }

    public final void a(long j, ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() >= 9) {
            int i = parsableByteArray.readInt();
            int i2 = parsableByteArray.readInt();
            int unsignedByte = parsableByteArray.readUnsignedByte();
            if (i == 434 && i2 == 1195456820 && unsignedByte == 3) {
                CeaUtil.consumeCcData(j, parsableByteArray, this.b);
            }
        }
    }
}
