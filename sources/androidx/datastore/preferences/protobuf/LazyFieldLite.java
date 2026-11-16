package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class LazyFieldLite {
    public volatile MessageLite a;
    public volatile ByteString b;

    public int hashCode() {
        return 1;
    }

    public final MessageLite a(MessageLite messageLite) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = messageLite;
                        this.b = ByteString.b;
                    } catch (InvalidProtocolBufferException unused) {
                        this.a = messageLite;
                        this.b = ByteString.b;
                    }
                }
            }
        }
        return this.a;
    }

    public final ByteString b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    return this.b;
                }
                if (this.a == null) {
                    this.b = ByteString.b;
                } else {
                    this.b = this.a.toByteString();
                }
                return this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyFieldLite)) {
            return false;
        }
        LazyFieldLite lazyFieldLite = (LazyFieldLite) obj;
        MessageLite messageLite = this.a;
        MessageLite messageLite2 = lazyFieldLite.a;
        if (messageLite == null && messageLite2 == null) {
            return b().equals(lazyFieldLite.b());
        }
        if (messageLite == null || messageLite2 == null) {
            return messageLite != null ? messageLite.equals(lazyFieldLite.a(messageLite.a())) : a(messageLite2.a()).equals(messageLite2);
        }
        return messageLite.equals(messageLite2);
    }
}
