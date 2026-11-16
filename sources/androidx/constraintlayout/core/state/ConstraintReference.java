package androidx.constraintlayout.core.state;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ConstraintReference implements Reference {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ConstraintReferenceFactory {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class IncorrectConstraintException extends Exception {
        private final ArrayList<String> a;

        @Override // java.lang.Throwable
        public String toString() {
            return "IncorrectConstraintException: " + this.a.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.ConstraintReference$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[State.Constraint.values().length];
            a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[14] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[13] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[12] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[17] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[15] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[16] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }
}
