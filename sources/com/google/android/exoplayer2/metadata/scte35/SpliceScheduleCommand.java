package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.ParsableByteArray;
import defpackage.wh2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new wh2();
    public final List<Event> events;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ComponentSplice {
        public final int componentTag;
        public final long utcSpliceTime;

        /* JADX INFO: Access modifiers changed from: private */
        public static ComponentSplice createFromParcel(Parcel parcel) {
            return new ComponentSplice(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToParcel(Parcel parcel) {
            parcel.writeInt(this.componentTag);
            parcel.writeLong(this.utcSpliceTime);
        }

        private ComponentSplice(int i, long j) {
            this.componentTag = i;
            this.utcSpliceTime = j;
        }

        public /* synthetic */ ComponentSplice(int i, long j, wh2 wh2Var) {
            this(i, j);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Event {
        public final boolean autoReturn;
        public final int availNum;
        public final int availsExpected;
        public final long breakDurationUs;
        public final List<ComponentSplice> componentSpliceList;
        public final boolean outOfNetworkIndicator;
        public final boolean programSpliceFlag;
        public final boolean spliceEventCancelIndicator;
        public final long spliceEventId;
        public final int uniqueProgramId;
        public final long utcSpliceTime;

        /* JADX INFO: Access modifiers changed from: private */
        public static Event createFromParcel(Parcel parcel) {
            return new Event(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToParcel(Parcel parcel) {
            parcel.writeLong(this.spliceEventId);
            parcel.writeByte(this.spliceEventCancelIndicator ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.outOfNetworkIndicator ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.programSpliceFlag ? (byte) 1 : (byte) 0);
            int size = this.componentSpliceList.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.componentSpliceList.get(i).writeToParcel(parcel);
            }
            parcel.writeLong(this.utcSpliceTime);
            parcel.writeByte(this.autoReturn ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.breakDurationUs);
            parcel.writeInt(this.uniqueProgramId);
            parcel.writeInt(this.availNum);
            parcel.writeInt(this.availsExpected);
        }

        private Event(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            this.spliceEventId = parcel.readLong();
            if (parcel.readByte() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.spliceEventCancelIndicator = z;
            if (parcel.readByte() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.outOfNetworkIndicator = z2;
            if (parcel.readByte() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.programSpliceFlag = z3;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(ComponentSplice.createFromParcel(parcel));
            }
            this.componentSpliceList = Collections.unmodifiableList(arrayList);
            this.utcSpliceTime = parcel.readLong();
            this.autoReturn = parcel.readByte() == 1;
            this.breakDurationUs = parcel.readLong();
            this.uniqueProgramId = parcel.readInt();
            this.availNum = parcel.readInt();
            this.availsExpected = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Event parseFromSection(ParsableByteArray parsableByteArray) {
            ArrayList arrayList;
            boolean z;
            boolean z2;
            long j;
            boolean z3;
            long j2;
            int i;
            int i2;
            int unsignedByte;
            boolean z4;
            boolean z5;
            boolean z6;
            long unsignedInt;
            boolean z7;
            long unsignedInt2;
            boolean z8;
            long unsignedInt3 = parsableByteArray.readUnsignedInt();
            boolean z9 = true;
            if ((parsableByteArray.readUnsignedByte() & 128) == 0) {
                z9 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (!z9) {
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                if ((unsignedByte2 & 128) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((unsignedByte2 & 64) != 0) {
                    z5 = z9;
                } else {
                    z5 = false;
                }
                if ((unsignedByte2 & 32) != 0) {
                    z6 = z9;
                } else {
                    z6 = false;
                }
                if (z5) {
                    unsignedInt = parsableByteArray.readUnsignedInt();
                } else {
                    unsignedInt = -9223372036854775807L;
                }
                if (!z5) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    ArrayList arrayList3 = new ArrayList(unsignedByte3);
                    int i3 = 0;
                    while (i3 < unsignedByte3) {
                        arrayList3.add(new ComponentSplice(parsableByteArray.readUnsignedByte(), parsableByteArray.readUnsignedInt(), null));
                        i3++;
                        unsignedByte3 = unsignedByte3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z6) {
                    long unsignedByte4 = parsableByteArray.readUnsignedByte();
                    if ((128 & unsignedByte4) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    unsignedInt2 = ((((unsignedByte4 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                    z7 = z8;
                } else {
                    z7 = false;
                    unsignedInt2 = -9223372036854775807L;
                }
                int unsignedShort = parsableByteArray.readUnsignedShort();
                int unsignedByte5 = parsableByteArray.readUnsignedByte();
                boolean z10 = z4;
                z3 = z7;
                z = z10;
                unsignedByte = parsableByteArray.readUnsignedByte();
                long j3 = unsignedInt;
                i = unsignedShort;
                i2 = unsignedByte5;
                long j4 = unsignedInt2;
                arrayList = arrayList2;
                z2 = z5;
                j = j3;
                j2 = j4;
            } else {
                arrayList = arrayList2;
                z = false;
                z2 = false;
                j = -9223372036854775807L;
                z3 = false;
                j2 = -9223372036854775807L;
                i = 0;
                i2 = 0;
                unsignedByte = 0;
            }
            return new Event(unsignedInt3, z9, z, z2, arrayList, j, z3, j2, i, i2, unsignedByte);
        }

        private Event(long j, boolean z, boolean z2, boolean z3, List<ComponentSplice> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.spliceEventId = j;
            this.spliceEventCancelIndicator = z;
            this.outOfNetworkIndicator = z2;
            this.programSpliceFlag = z3;
            this.componentSpliceList = Collections.unmodifiableList(list);
            this.utcSpliceTime = j2;
            this.autoReturn = z4;
            this.breakDurationUs = j3;
            this.uniqueProgramId = i;
            this.availNum = i2;
            this.availsExpected = i3;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.events.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.events.get(i2).writeToParcel(parcel);
        }
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(Event.createFromParcel(parcel));
        }
        this.events = Collections.unmodifiableList(arrayList);
    }

    public static SpliceScheduleCommand parseFromSection(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        ArrayList arrayList = new ArrayList(unsignedByte);
        for (int i = 0; i < unsignedByte; i++) {
            arrayList.add(Event.parseFromSection(parsableByteArray));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    private SpliceScheduleCommand(List<Event> list) {
        this.events = Collections.unmodifiableList(list);
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, wh2 wh2Var) {
        this(parcel);
    }
}
