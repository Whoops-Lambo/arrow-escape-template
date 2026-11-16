package androidx.work;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class WorkInfo {
    public final UUID a;
    public final State b;
    public final Data c;
    public final HashSet d;
    public final Data e;
    public final int f;
    public final int g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class State {
        public static final State a;
        public static final State b;
        public static final State c;
        public static final State d;
        public static final State e;
        public static final State f;
        public static final /* synthetic */ State[] g;

        static {
            State state = new State("ENQUEUED", 0);
            a = state;
            State state2 = new State("RUNNING", 1);
            b = state2;
            State state3 = new State("SUCCEEDED", 2);
            c = state3;
            State state4 = new State("FAILED", 3);
            d = state4;
            State state5 = new State("BLOCKED", 4);
            e = state5;
            State state6 = new State("CANCELLED", 5);
            f = state6;
            g = new State[]{state, state2, state3, state4, state5, state6};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) g.clone();
        }

        public final boolean d() {
            return this == c || this == d || this == f;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WorkInfo.class != obj.getClass()) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.f == workInfo.f && this.g == workInfo.g && this.a.equals(workInfo.a) && this.b == workInfo.b && this.c.equals(workInfo.c) && this.d.equals(workInfo.d)) {
            return this.e.equals(workInfo.e);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.a + "', mState=" + this.b + ", mOutputData=" + this.c + ", mTags=" + this.d + ", mProgress=" + this.e + '}';
    }

    public WorkInfo(UUID uuid, State state, Data data, ArrayList arrayList, Data data2, int i, int i2) {
        this.a = uuid;
        this.b = state;
        this.c = data;
        this.d = new HashSet(arrayList);
        this.e = data2;
        this.f = i;
        this.g = i2;
    }
}
