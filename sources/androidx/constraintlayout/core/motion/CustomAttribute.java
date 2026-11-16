package androidx.constraintlayout.core.motion;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class CustomAttribute {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class AttributeType {
        public static final /* synthetic */ AttributeType[] a = {new AttributeType("INT_TYPE", 0), new AttributeType("FLOAT_TYPE", 1), new AttributeType("COLOR_TYPE", 2), new AttributeType("COLOR_DRAWABLE_TYPE", 3), new AttributeType("STRING_TYPE", 4), new AttributeType("BOOLEAN_TYPE", 5), new AttributeType("DIMENSION_TYPE", 6), new AttributeType("REFERENCE_TYPE", 7)};

        /* JADX INFO: Fake field, exist only in values array */
        AttributeType EF5;

        public static AttributeType valueOf(String str) {
            return (AttributeType) Enum.valueOf(AttributeType.class, str);
        }

        public static AttributeType[] values() {
            return (AttributeType[]) a.clone();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.CustomAttribute$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AttributeType.values().length];
            a = iArr;
            try {
                iArr[7] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[6] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }
}
