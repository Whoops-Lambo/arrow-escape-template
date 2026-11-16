package com.unity3d.services.core.network.model;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.e80;
import defpackage.h50;
import defpackage.hg0;
import defpackage.jc1;
import defpackage.n30;
import defpackage.pv1;
import defpackage.s71;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b9\b\u0086\b\u0018\u0000 S2\u00020\u0001:\u0001SBá\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\t\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001b\u0010?\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\tHÆ\u0003J\u0015\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\t\u0010A\u001a\u00020\rHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010.J\t\u0010E\u001a\u00020\u0011HÆ\u0003J\t\u0010F\u001a\u00020\u0011HÆ\u0003J\t\u0010G\u001a\u00020\u0011HÆ\u0003J\t\u0010H\u001a\u00020\u0011HÆ\u0003J\t\u0010I\u001a\u00020\u0017HÆ\u0003J\t\u0010J\u001a\u00020\u0019HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\t\u0010L\u001a\u00020\u0011HÆ\u0003Jè\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u0011HÆ\u0001¢\u0006\u0002\u0010NJ\u0013\u0010O\u001a\u00020\u00172\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020\u0011HÖ\u0001J\t\u0010R\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R#\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0013\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0011\u0010\u0014\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b3\u00101R\u0011\u0010\u0015\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b4\u00101R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u00105R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u001c\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b:\u00101¨\u0006T"}, d2 = {"Lcom/unity3d/services/core/network/model/HttpRequest;", "", "baseURL", "", "path", "method", "Lcom/unity3d/services/core/network/model/RequestType;", "body", "headers", "", "", "parameters", "bodyType", "Lcom/unity3d/services/core/network/model/BodyType;", "contentType", "scheme", "port", "", "connectTimeout", "readTimeout", "writeTimeout", "callTimeout", "isProtobuf", "", "operationType", "Lcom/unity3d/ads/core/data/model/OperationType;", "downloadDestination", "Ljava/io/File;", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/services/core/network/model/RequestType;Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/services/core/network/model/BodyType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;IIIIZLcom/unity3d/ads/core/data/model/OperationType;Ljava/io/File;I)V", "getBaseURL", "()Ljava/lang/String;", "getPath", "getMethod", "()Lcom/unity3d/services/core/network/model/RequestType;", "getBody", "()Ljava/lang/Object;", "getHeaders", "()Ljava/util/Map;", "getParameters", "getBodyType", "()Lcom/unity3d/services/core/network/model/BodyType;", "getContentType", "getScheme", "getPort", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getConnectTimeout", "()I", "getReadTimeout", "getWriteTimeout", "getCallTimeout", "()Z", "getOperationType", "()Lcom/unity3d/ads/core/data/model/OperationType;", "getDownloadDestination", "()Ljava/io/File;", "getPriority", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/services/core/network/model/RequestType;Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/services/core/network/model/BodyType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;IIIIZLcom/unity3d/ads/core/data/model/OperationType;Ljava/io/File;I)Lcom/unity3d/services/core/network/model/HttpRequest;", "equals", "other", "hashCode", "toString", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class HttpRequest {

    @NotNull
    public static final String DEFAULT_SCHEME = "https";
    public static final int DEFAULT_TIMEOUT = 30000;

    @NotNull
    private final String baseURL;

    @Nullable
    private final Object body;

    @NotNull
    private final BodyType bodyType;
    private final int callTimeout;
    private final int connectTimeout;

    @Nullable
    private final String contentType;

    @Nullable
    private final File downloadDestination;

    @NotNull
    private final Map<String, List<String>> headers;
    private final boolean isProtobuf;

    @NotNull
    private final RequestType method;

    @NotNull
    private final OperationType operationType;

    @NotNull
    private final Map<String, String> parameters;

    @NotNull
    private final String path;

    @Nullable
    private final Integer port;
    private final int priority;
    private final int readTimeout;

    @NotNull
    private final String scheme;
    private final int writeTimeout;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, String str4, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5, int i6, e80 e80Var) {
        String str5 = (i6 & 2) != 0 ? "" : str2;
        RequestType requestType2 = (i6 & 4) != 0 ? RequestType.GET : requestType;
        Object obj2 = (i6 & 8) != 0 ? null : obj;
        int i7 = i6 & 16;
        Map map3 = hg0.a;
        this(str, str5, requestType2, obj2, i7 != 0 ? map3 : map, (i6 & 32) == 0 ? map2 : map3, (i6 & 64) != 0 ? BodyType.UNKNOWN : bodyType, (i6 & 128) != 0 ? null : str3, (i6 & 256) != 0 ? DEFAULT_SCHEME : str4, (i6 & 512) != 0 ? null : num, (i6 & 1024) != 0 ? 30000 : i, (i6 & 2048) != 0 ? 30000 : i2, (i6 & 4096) != 0 ? 30000 : i3, (i6 & 8192) == 0 ? i4 : 30000, (i6 & 16384) != 0 ? false : z, (i6 & 32768) != 0 ? OperationType.UNKNOWN : operationType, (i6 & 65536) == 0 ? file : null, (i6 & 131072) != 0 ? 0 : i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, String str4, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5, int i6, Object obj2) {
        int i7;
        File file2;
        String str5 = (i6 & 1) != 0 ? httpRequest.baseURL : str;
        String str6 = (i6 & 2) != 0 ? httpRequest.path : str2;
        RequestType requestType2 = (i6 & 4) != 0 ? httpRequest.method : requestType;
        Object obj3 = (i6 & 8) != 0 ? httpRequest.body : obj;
        Map map3 = (i6 & 16) != 0 ? httpRequest.headers : map;
        Map map4 = (i6 & 32) != 0 ? httpRequest.parameters : map2;
        BodyType bodyType2 = (i6 & 64) != 0 ? httpRequest.bodyType : bodyType;
        String str7 = (i6 & 128) != 0 ? httpRequest.contentType : str3;
        String str8 = (i6 & 256) != 0 ? httpRequest.scheme : str4;
        Integer num2 = (i6 & 512) != 0 ? httpRequest.port : num;
        int i8 = (i6 & 1024) != 0 ? httpRequest.connectTimeout : i;
        int i9 = (i6 & 2048) != 0 ? httpRequest.readTimeout : i2;
        int i10 = (i6 & 4096) != 0 ? httpRequest.writeTimeout : i3;
        int i11 = (i6 & 8192) != 0 ? httpRequest.callTimeout : i4;
        String str9 = str5;
        boolean z2 = (i6 & 16384) != 0 ? httpRequest.isProtobuf : z;
        OperationType operationType2 = (i6 & 32768) != 0 ? httpRequest.operationType : operationType;
        File file3 = (i6 & 65536) != 0 ? httpRequest.downloadDestination : file;
        if ((i6 & 131072) != 0) {
            file2 = file3;
            i7 = httpRequest.priority;
        } else {
            i7 = i5;
            file2 = file3;
        }
        return httpRequest.copy(str9, str6, requestType2, obj3, map3, map4, bodyType2, str7, str8, num2, i8, i9, i10, i11, z2, operationType2, file2, i7);
    }

    @NotNull
    public final HttpRequest copy(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @Nullable Object body, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull BodyType bodyType, @Nullable String contentType, @NotNull String scheme, @Nullable Integer port, int connectTimeout, int readTimeout, int writeTimeout, int callTimeout, boolean isProtobuf, @NotNull OperationType operationType, @Nullable File downloadDestination, int priority) {
        baseURL.getClass();
        path.getClass();
        method.getClass();
        headers.getClass();
        parameters.getClass();
        bodyType.getClass();
        scheme.getClass();
        operationType.getClass();
        return new HttpRequest(baseURL, path, method, body, headers, parameters, bodyType, contentType, scheme, port, connectTimeout, readTimeout, writeTimeout, callTimeout, isProtobuf, operationType, downloadDestination, priority);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) other;
        return s71.b(this.baseURL, httpRequest.baseURL) && s71.b(this.path, httpRequest.path) && this.method == httpRequest.method && s71.b(this.body, httpRequest.body) && s71.b(this.headers, httpRequest.headers) && s71.b(this.parameters, httpRequest.parameters) && this.bodyType == httpRequest.bodyType && s71.b(this.contentType, httpRequest.contentType) && s71.b(this.scheme, httpRequest.scheme) && s71.b(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout && this.isProtobuf == httpRequest.isProtobuf && this.operationType == httpRequest.operationType && s71.b(this.downloadDestination, httpRequest.downloadDestination) && this.priority == httpRequest.priority;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBaseURL() {
        return this.baseURL;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getPort() {
        return this.port;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getReadTimeout() {
        return this.readTimeout;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getCallTimeout() {
        return this.callTimeout;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIsProtobuf() {
        return this.isProtobuf;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final OperationType getOperationType() {
        return this.operationType;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final File getDownloadDestination() {
        return this.downloadDestination;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RequestType getMethod() {
        return this.method;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getBody() {
        return this.body;
    }

    @NotNull
    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    @NotNull
    public final Map<String, String> component6() {
        return this.parameters;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BodyType getBodyType() {
        return this.bodyType;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @NotNull
    public final String getBaseURL() {
        return this.baseURL;
    }

    @Nullable
    public final Object getBody() {
        return this.body;
    }

    @NotNull
    public final BodyType getBodyType() {
        return this.bodyType;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    @Nullable
    public final String getContentType() {
        return this.contentType;
    }

    @Nullable
    public final File getDownloadDestination() {
        return this.downloadDestination;
    }

    @NotNull
    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final RequestType getMethod() {
        return this.method;
    }

    @NotNull
    public final OperationType getOperationType() {
        return this.operationType;
    }

    @NotNull
    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final Integer getPort() {
        return this.port;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    @NotNull
    public final String getScheme() {
        return this.scheme;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public int hashCode() {
        int iHashCode = (this.method.hashCode() + n30.c(this.baseURL.hashCode() * 31, 31, this.path)) * 31;
        Object obj = this.body;
        int iHashCode2 = (this.bodyType.hashCode() + pv1.g(this.parameters, pv1.g(this.headers, (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31, 31), 31)) * 31;
        String str = this.contentType;
        int iC = n30.c((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.scheme);
        Integer num = this.port;
        int iHashCode3 = (this.operationType.hashCode() + jc1.f(jc1.d(this.callTimeout, jc1.d(this.writeTimeout, jc1.d(this.readTimeout, jc1.d(this.connectTimeout, (iC + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31), 31, this.isProtobuf)) * 31;
        File file = this.downloadDestination;
        return Integer.hashCode(this.priority) + ((iHashCode3 + (file != null ? file.hashCode() : 0)) * 31);
    }

    public final boolean isProtobuf() {
        return this.isProtobuf;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("HttpRequest(baseURL=");
        sb.append(this.baseURL);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", method=");
        sb.append(this.method);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", parameters=");
        sb.append(this.parameters);
        sb.append(", bodyType=");
        sb.append(this.bodyType);
        sb.append(", contentType=");
        sb.append(this.contentType);
        sb.append(", scheme=");
        sb.append(this.scheme);
        sb.append(", port=");
        sb.append(this.port);
        sb.append(", connectTimeout=");
        sb.append(this.connectTimeout);
        sb.append(", readTimeout=");
        sb.append(this.readTimeout);
        sb.append(", writeTimeout=");
        sb.append(this.writeTimeout);
        sb.append(", callTimeout=");
        sb.append(this.callTimeout);
        sb.append(", isProtobuf=");
        sb.append(this.isProtobuf);
        sb.append(", operationType=");
        sb.append(this.operationType);
        sb.append(", downloadDestination=");
        sb.append(this.downloadDestination);
        sb.append(", priority=");
        return h50.l(sb, this.priority, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String str, @NotNull String str2) {
        this(str, str2, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 262140, null);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String str, @NotNull String str2, @NotNull RequestType requestType) {
        this(str, str2, requestType, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 262136, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String str, @NotNull String str2, @NotNull RequestType requestType, @Nullable Object obj) {
        this(str, str2, requestType, obj, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 262128, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String str, @NotNull String str2, @NotNull RequestType requestType, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> map) {
        this(str, str2, requestType, obj, map, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 262112, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String str, @NotNull String str2, @NotNull RequestType requestType, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> map, @NotNull Map<String, String> map2) {
        this(str, str2, requestType, obj, map, map2, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 262080, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String str, @NotNull String str2, @NotNull RequestType requestType, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> map, @NotNull Map<String, String> map2, @NotNull BodyType bodyType) {
        this(str, str2, requestType, obj, map, map2, bodyType, null, null, null, 0, 0, 0, 0, false, null, null, 0, 262016, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String str, @NotNull String str2, @NotNull RequestType requestType, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> map, @NotNull Map<String, String> map2, @NotNull BodyType bodyType, @Nullable String str3) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, null, null, 0, 0, 0, 0, false, null, null, 0, 261888, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String str, @NotNull String str2, @NotNull RequestType requestType, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> map, @NotNull Map<String, String> map2, @NotNull BodyType bodyType, @Nullable String str3, @NotNull String str4) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, str4, null, 0, 0, 0, 0, false, null, null, 0, 261632, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String str, @NotNull String str2, @NotNull RequestType requestType, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> map, @NotNull Map<String, String> map2, @NotNull BodyType bodyType, @Nullable String str3, @NotNull String str4, @Nullable Integer num) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, str4, num, 0, 0, 0, 0, false, null, null, 0, 261120, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String str, @NotNull String str2, @NotNull RequestType requestType, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> map, @NotNull Map<String, String> map2, @NotNull BodyType bodyType, @Nullable String str3, @NotNull String str4, @Nullable Integer num, int i) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, str4, num, i, 0, 0, 0, false, null, null, 0, 260096, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String str, @NotNull String str2, @NotNull RequestType requestType, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> map, @NotNull Map<String, String> map2, @NotNull BodyType bodyType, @Nullable String str3, @NotNull String str4, @Nullable Integer num, int i, int i2) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, str4, num, i, i2, 0, 0, false, null, null, 0, 258048, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String str, @NotNull String str2, @NotNull RequestType requestType, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> map, @NotNull Map<String, String> map2, @NotNull BodyType bodyType, @Nullable String str3, @NotNull String str4, @Nullable Integer num, int i, int i2, int i3) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, str4, num, i, i2, i3, 0, false, null, null, 0, 253952, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String str, @NotNull String str2, @NotNull RequestType requestType, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> map, @NotNull Map<String, String> map2, @NotNull BodyType bodyType, @Nullable String str3, @NotNull String str4, @Nullable Integer num, int i, int i2, int i3, int i4) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, str4, num, i, i2, i3, i4, false, null, null, 0, 245760, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String str, @NotNull String str2, @NotNull RequestType requestType, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> map, @NotNull Map<String, String> map2, @NotNull BodyType bodyType, @Nullable String str3, @NotNull String str4, @Nullable Integer num, int i, int i2, int i3, int i4, boolean z) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, str4, num, i, i2, i3, i4, z, null, null, 0, 229376, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String str, @NotNull String str2, @NotNull RequestType requestType, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> map, @NotNull Map<String, String> map2, @NotNull BodyType bodyType, @Nullable String str3, @NotNull String str4, @Nullable Integer num, int i, int i2, int i3, int i4, boolean z, @NotNull OperationType operationType) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, str4, num, i, i2, i3, i4, z, operationType, null, 0, 196608, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
        str4.getClass();
        operationType.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String str, @NotNull String str2, @NotNull RequestType requestType, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> map, @NotNull Map<String, String> map2, @NotNull BodyType bodyType, @Nullable String str3, @NotNull String str4, @Nullable Integer num, int i, int i2, int i3, int i4, boolean z, @NotNull OperationType operationType, @Nullable File file) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, str4, num, i, i2, i3, i4, z, operationType, file, 0, 131072, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
        str4.getClass();
        operationType.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(@NotNull String str, @NotNull String str2, @NotNull RequestType requestType, @Nullable Object obj, @NotNull Map<String, ? extends List<String>> map, @NotNull Map<String, String> map2, @NotNull BodyType bodyType, @Nullable String str3, @NotNull String str4, @Nullable Integer num, int i, int i2, int i3, int i4, boolean z, @NotNull OperationType operationType, @Nullable File file, int i5) {
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
        str4.getClass();
        operationType.getClass();
        this.baseURL = str;
        this.path = str2;
        this.method = requestType;
        this.body = obj;
        this.headers = map;
        this.parameters = map2;
        this.bodyType = bodyType;
        this.contentType = str3;
        this.scheme = str4;
        this.port = num;
        this.connectTimeout = i;
        this.readTimeout = i2;
        this.writeTimeout = i3;
        this.callTimeout = i4;
        this.isProtobuf = z;
        this.operationType = operationType;
        this.downloadDestination = file;
        this.priority = i5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String str) {
        this(str, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 262142, null);
        str.getClass();
    }
}
