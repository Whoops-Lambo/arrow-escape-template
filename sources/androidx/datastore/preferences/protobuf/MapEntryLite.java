package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class MapEntryLite<K, V> {
    public final Metadata a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.MapEntryLite$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            a = iArr;
            try {
                iArr[WireFormat.FieldType.m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat.FieldType.p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WireFormat.FieldType.l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Metadata<K, V> {
        public final WireFormat.FieldType a;
        public final WireFormat.FieldType b;
        public final Object c;

        public Metadata(WireFormat.FieldType fieldType, WireFormat.FieldType fieldType2, Object obj) {
            this.a = fieldType;
            this.b = fieldType2;
            this.c = obj;
        }
    }

    public static int a(Metadata metadata, Object obj, Object obj2) {
        return FieldSet.b(metadata.a, 1, obj) + FieldSet.b(metadata.b, 2, obj2);
    }

    public static void b(CodedOutputStream codedOutputStream, Metadata metadata, Object obj, Object obj2) {
        FieldSet.n(codedOutputStream, metadata.a, 1, obj);
        FieldSet.n(codedOutputStream, metadata.b, 2, obj2);
    }

    public MapEntryLite(WireFormat.FieldType fieldType, WireFormat.FieldType fieldType2, GeneratedMessageLite generatedMessageLite) {
        this.a = new Metadata(fieldType, fieldType2, generatedMessageLite);
    }
}
