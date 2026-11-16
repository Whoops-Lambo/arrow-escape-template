package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class TextFormatEscaper {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.TextFormatEscaper$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    class AnonymousClass2 implements ByteSequence {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ByteSequence {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.TextFormatEscaper$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    class AnonymousClass1 implements ByteSequence {
        public final /* synthetic */ ByteString a;

        public AnonymousClass1(ByteString byteString) {
            this.a = byteString;
        }
    }

    public static String a(ByteString byteString) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(byteString);
        StringBuilder sb = new StringBuilder(byteString.size());
        int i = 0;
        while (true) {
            ByteString byteString2 = anonymousClass1.a;
            if (i >= byteString2.size()) {
                return sb.toString();
            }
            byte bH = byteString2.h(i);
            if (bH == 34) {
                sb.append("\\\"");
            } else if (bH == 39) {
                sb.append("\\'");
            } else if (bH != 92) {
                switch (bH) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bH >= 32 && bH <= 126) {
                            sb.append((char) bH);
                        } else {
                            sb.append('\\');
                            sb.append((char) (((bH >>> 6) & 3) + 48));
                            sb.append((char) (((bH >>> 3) & 7) + 48));
                            sb.append((char) ((bH & 7) + 48));
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
            i++;
        }
    }
}
