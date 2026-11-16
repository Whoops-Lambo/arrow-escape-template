package com.applovin.shadow.okhttp3.internal.http2;

import com.applovin.shadow.okio.ByteString;
import defpackage.s71;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00062\b\b\u0002\u0010\u0004\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\nHÖ\u0001J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u0010\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http2/Header;", "", "name", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/applovin/shadow/okio/ByteString;", "(Lokio/ByteString;Ljava/lang/String;)V", "(Lokio/ByteString;Lokio/ByteString;)V", "hpackSize", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Header {

    @NotNull
    public static final ByteString PSEUDO_PREFIX;

    @NotNull
    public static final ByteString RESPONSE_STATUS;

    @NotNull
    public static final String RESPONSE_STATUS_UTF8 = ":status";

    @NotNull
    public static final ByteString TARGET_AUTHORITY;

    @NotNull
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";

    @NotNull
    public static final ByteString TARGET_METHOD;

    @NotNull
    public static final String TARGET_METHOD_UTF8 = ":method";

    @NotNull
    public static final ByteString TARGET_PATH;

    @NotNull
    public static final String TARGET_PATH_UTF8 = ":path";

    @NotNull
    public static final ByteString TARGET_SCHEME;

    @NotNull
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;

    @NotNull
    public final ByteString name;

    @NotNull
    public final ByteString value;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Header)) {
            return false;
        }
        Header header = (Header) other;
        return s71.b(this.name, header.name) && s71.b(this.value, header.value);
    }

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        PSEUDO_PREFIX = companion.encodeUtf8(":");
        RESPONSE_STATUS = companion.encodeUtf8(":status");
        TARGET_METHOD = companion.encodeUtf8(":method");
        TARGET_PATH = companion.encodeUtf8(":path");
        TARGET_SCHEME = companion.encodeUtf8(":scheme");
        TARGET_AUTHORITY = companion.encodeUtf8(":authority");
    }

    public static /* synthetic */ Header copy$default(Header header, ByteString byteString, ByteString byteString2, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = header.name;
        }
        if ((i & 2) != 0) {
            byteString2 = header.value;
        }
        return header.copy(byteString, byteString2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ByteString getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ByteString getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return this.name.utf8() + ": " + this.value.utf8();
    }

    public Header(@NotNull ByteString byteString, @NotNull ByteString byteString2) {
        byteString.getClass();
        byteString2.getClass();
        this.name = byteString;
        this.value = byteString2;
        this.hpackSize = byteString2.size() + byteString.size() + 32;
    }

    @NotNull
    public final Header copy(@NotNull ByteString name, @NotNull ByteString value) {
        name.getClass();
        value.getClass();
        return new Header(name, value);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Header(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        ByteString.Companion companion = ByteString.INSTANCE;
        this(companion.encodeUtf8(str), companion.encodeUtf8(str2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(@NotNull ByteString byteString, @NotNull String str) {
        this(byteString, ByteString.INSTANCE.encodeUtf8(str));
        byteString.getClass();
        str.getClass();
    }
}
