package okhttp3;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.internal.partials.OkHttpNetworkBridge;
import defpackage.az2;
import defpackage.dr0;
import defpackage.e32;
import defpackage.e80;
import defpackage.er;
import defpackage.nq2;
import defpackage.s71;
import defpackage.wr0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0006H\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010\u0003R\u0018\u0010)\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "<init>", "()V", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function1;", "Lokio/BufferedSource;", "consumer", "", "sizeMapper", "consumeSource", "(Lwr0;Lwr0;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", G5.N, "()Ljava/nio/charset/Charset;", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Ljava/io/InputStream;", "byteStream", "()Ljava/io/InputStream;", "source", "()Lokio/BufferedSource;", "", "bytes", "()[B", "Lokio/ByteString;", "byteString", "()Lokio/ByteString;", "Ljava/io/Reader;", "charStream", "()Ljava/io/Reader;", "", "string", "()Ljava/lang/String;", "Laz2;", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "reader", "Ljava/io/Reader;", "Companion", "BomAwareReader", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class ResponseBody implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Reader reader;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\fH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\rH\u0007J'\u0010\u000e\u001a\u00020\u0004*\u00020\u000b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003¨\u0006\u0010"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "()V", "create", "Lokhttp3/ResponseBody;", "contentType", "Lokhttp3/MediaType;", "content", "", "contentLength", "", "Lokio/BufferedSource;", "", "Lokio/ByteString;", "asResponseBody", "toResponseBody", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ ResponseBody create$default(Companion companion, BufferedSource bufferedSource, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(bufferedSource, mediaType, j);
        }

        public /* synthetic */ Companion(e80 e80Var) {
            this();
        }

        @NotNull
        public final ResponseBody create(@NotNull String str, @Nullable MediaType mediaType) {
            str.getClass();
            Charset charset = er.a;
            if (mediaType != null) {
                Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charsetCharset$default == null) {
                    mediaType = MediaType.INSTANCE.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            Buffer bufferWriteString = new Buffer().writeString(str, charset);
            return create(bufferWriteString, mediaType, bufferWriteString.size());
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        @NotNull
        public final ResponseBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
            bArr.getClass();
            return create(new Buffer().write(bArr), mediaType, bArr.length);
        }

        @NotNull
        public final ResponseBody create(@NotNull ByteString byteString, @Nullable MediaType mediaType) {
            byteString.getClass();
            return create(new Buffer().write(byteString), mediaType, byteString.size());
        }

        @NotNull
        public final ResponseBody create(@NotNull final BufferedSource bufferedSource, @Nullable final MediaType mediaType, final long j) {
            bufferedSource.getClass();
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: contentLength, reason: from getter */
                public long get$contentLength() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                @Nullable
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                @NotNull
                /* JADX INFO: renamed from: source, reason: from getter */
                public BufferedSource get$this_asResponseBody() {
                    return bufferedSource;
                }
            };
        }

        @NotNull
        public final ResponseBody create(@Nullable MediaType contentType, @NotNull String content) {
            content.getClass();
            return create(content, contentType);
        }

        @NotNull
        public final ResponseBody create(@Nullable MediaType contentType, @NotNull byte[] content) {
            content.getClass();
            return create(content, contentType);
        }

        @NotNull
        public final ResponseBody create(@Nullable MediaType contentType, @NotNull ByteString content) {
            content.getClass();
            return create(content, contentType);
        }

        @NotNull
        public final ResponseBody create(@Nullable MediaType contentType, long contentLength, @NotNull BufferedSource content) {
            content.getClass();
            return create(content, contentType, contentLength);
        }
    }

    /* JADX INFO: renamed from: contentLength */
    public abstract long get$contentLength();

    @Nullable
    /* JADX INFO: renamed from: contentType */
    public abstract MediaType get$contentType();

    @NotNull
    /* JADX INFO: renamed from: source */
    public abstract BufferedSource get$this_asResponseBody();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "Lokio/BufferedSource;", "source", "Ljava/nio/charset/Charset;", G5.N, "<init>", "(Lokio/BufferedSource;Ljava/nio/charset/Charset;)V", "", "cbuf", "", "off", "len", "read", "([CII)I", "Laz2;", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "()V", "Lokio/BufferedSource;", "Ljava/nio/charset/Charset;", "", "closed", "Z", "delegate", "Ljava/io/Reader;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class BomAwareReader extends Reader {

        @NotNull
        private final Charset charset;
        private boolean closed;

        @Nullable
        private Reader delegate;

        @NotNull
        private final BufferedSource source;

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            az2 az2Var;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader == null) {
                az2Var = null;
            } else {
                reader.close();
                az2Var = az2.a;
            }
            if (az2Var == null) {
                this.source.close();
            }
        }

        public BomAwareReader(@NotNull BufferedSource bufferedSource, @NotNull Charset charset) {
            bufferedSource.getClass();
            charset.getClass();
            this.source = bufferedSource;
            this.charset = charset;
        }

        @Override // java.io.Reader
        public int read(@NotNull char[] cbuf, int off, int len) throws IOException {
            cbuf.getClass();
            if (!this.closed) {
                Reader inputStreamReader = this.delegate;
                if (inputStreamReader == null) {
                    inputStreamReader = new InputStreamReader(this.source.inputStream(), Util.readBomAsCharset(this.source, this.charset));
                    this.delegate = inputStreamReader;
                }
                return inputStreamReader.read(cbuf, off, len);
            }
            dr0.h("Stream closed");
            return 0;
        }
    }

    @NotNull
    public static final ResponseBody create(@NotNull String str, @Nullable MediaType mediaType) {
        return INSTANCE.create(str, mediaType);
    }

    @NotNull
    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(OkHttpNetworkBridge.retrofitExceptionCatchingRequestBody_source(this), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    private final Charset charset() {
        Charset charset;
        MediaType mediaTypeContentType = get$contentType();
        if (mediaTypeContentType == null) {
            charset = null;
        } else {
            charset = mediaTypeContentType.charset(er.a);
        }
        if (charset == null) {
            return er.a;
        }
        return charset;
    }

    private final <T> T consumeSource(wr0 consumer, wr0 sizeMapper) throws IOException {
        long jContentLength = get$contentLength();
        if (jContentLength <= 2147483647L) {
            BufferedSource bufferedSourceRetrofitExceptionCatchingRequestBody_source = OkHttpNetworkBridge.retrofitExceptionCatchingRequestBody_source(this);
            try {
                T t = (T) consumer.invoke(bufferedSourceRetrofitExceptionCatchingRequestBody_source);
                nq2.e(bufferedSourceRetrofitExceptionCatchingRequestBody_source, null);
                int iIntValue = ((Number) sizeMapper.invoke(t)).intValue();
                if (jContentLength != -1 && jContentLength != iIntValue) {
                    e32.b(iIntValue, jContentLength);
                    return null;
                }
                return t;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    nq2.e(bufferedSourceRetrofitExceptionCatchingRequestBody_source, th);
                    throw th2;
                }
            }
        }
        dr0.h(s71.B(Long.valueOf(jContentLength), "Cannot buffer entire body for content length: "));
        return null;
    }

    @NotNull
    public final InputStream byteStream() {
        return OkHttpNetworkBridge.retrofitExceptionCatchingRequestBody_source(this).inputStream();
    }

    @NotNull
    public final ByteString byteString() throws IOException {
        long jContentLength = get$contentLength();
        if (jContentLength <= 2147483647L) {
            BufferedSource bufferedSourceRetrofitExceptionCatchingRequestBody_source = OkHttpNetworkBridge.retrofitExceptionCatchingRequestBody_source(this);
            try {
                ByteString byteString = bufferedSourceRetrofitExceptionCatchingRequestBody_source.readByteString();
                nq2.e(bufferedSourceRetrofitExceptionCatchingRequestBody_source, null);
                int size = byteString.size();
                if (jContentLength != -1 && jContentLength != size) {
                    e32.b(size, jContentLength);
                    return null;
                }
                return byteString;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    nq2.e(bufferedSourceRetrofitExceptionCatchingRequestBody_source, th);
                    throw th2;
                }
            }
        }
        dr0.h(s71.B(Long.valueOf(jContentLength), "Cannot buffer entire body for content length: "));
        return null;
    }

    @NotNull
    public final byte[] bytes() throws IOException {
        long jContentLength = get$contentLength();
        if (jContentLength <= 2147483647L) {
            BufferedSource bufferedSourceRetrofitExceptionCatchingRequestBody_source = OkHttpNetworkBridge.retrofitExceptionCatchingRequestBody_source(this);
            try {
                byte[] byteArray = bufferedSourceRetrofitExceptionCatchingRequestBody_source.readByteArray();
                nq2.e(bufferedSourceRetrofitExceptionCatchingRequestBody_source, null);
                int length = byteArray.length;
                if (jContentLength != -1 && jContentLength != length) {
                    e32.b(length, jContentLength);
                    return null;
                }
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    nq2.e(bufferedSourceRetrofitExceptionCatchingRequestBody_source, th);
                    throw th2;
                }
            }
        }
        dr0.h(s71.B(Long.valueOf(jContentLength), "Cannot buffer entire body for content length: "));
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(OkHttpNetworkBridge.retrofitExceptionCatchingRequestBody_source(this));
    }

    @NotNull
    public final String string() throws IOException {
        BufferedSource bufferedSourceRetrofitExceptionCatchingRequestBody_source = OkHttpNetworkBridge.retrofitExceptionCatchingRequestBody_source(this);
        try {
            String string = bufferedSourceRetrofitExceptionCatchingRequestBody_source.readString(Util.readBomAsCharset(bufferedSourceRetrofitExceptionCatchingRequestBody_source, charset()));
            nq2.e(bufferedSourceRetrofitExceptionCatchingRequestBody_source, null);
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                nq2.e(bufferedSourceRetrofitExceptionCatchingRequestBody_source, th);
                throw th2;
            }
        }
    }

    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, long j, @NotNull BufferedSource bufferedSource) {
        return INSTANCE.create(mediaType, j, bufferedSource);
    }

    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull String str) {
        return INSTANCE.create(mediaType, str);
    }

    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull ByteString byteString) {
        return INSTANCE.create(mediaType, byteString);
    }

    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr) {
        return INSTANCE.create(mediaType, bArr);
    }

    @NotNull
    public static final ResponseBody create(@NotNull BufferedSource bufferedSource, @Nullable MediaType mediaType, long j) {
        return INSTANCE.create(bufferedSource, mediaType, j);
    }

    @NotNull
    public static final ResponseBody create(@NotNull ByteString byteString, @Nullable MediaType mediaType) {
        return INSTANCE.create(byteString, mediaType);
    }

    @NotNull
    public static final ResponseBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
        return INSTANCE.create(bArr, mediaType);
    }
}
