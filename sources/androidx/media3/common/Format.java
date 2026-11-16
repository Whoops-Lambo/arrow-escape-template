package androidx.media3.common;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.ironsource.C4664b4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.d31;
import defpackage.h50;
import defpackage.kd0;
import defpackage.kk;
import defpackage.l7;
import defpackage.nj;
import defpackage.p91;
import defpackage.y32;
import defpackage.z21;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Format {

    @UnstableApi
    public static final int CUE_REPLACEMENT_BEHAVIOR_MERGE = 1;

    @UnstableApi
    public static final int CUE_REPLACEMENT_BEHAVIOR_REPLACE = 2;
    public static final int NO_VALUE = -1;

    @UnstableApi
    public static final long OFFSET_SAMPLE_RELATIVE = Long.MAX_VALUE;

    @UnstableApi
    public final int accessibilityChannel;

    @UnstableApi
    public final int auxiliaryTrackType;

    @UnstableApi
    public final int averageBitrate;

    @UnstableApi
    public final int bitrate;
    public final int channelCount;

    @Nullable
    public final String codecs;

    @Nullable
    @UnstableApi
    public final ColorInfo colorInfo;

    @Nullable
    public final String containerMimeType;

    @UnstableApi
    public final int cryptoType;

    @UnstableApi
    public final int cueReplacementBehavior;

    @Nullable
    @UnstableApi
    public final Object customData;

    @UnstableApi
    public final int decodedHeight;

    @UnstableApi
    public final int decodedWidth;

    @Nullable
    @UnstableApi
    public final DrmInitData drmInitData;

    @UnstableApi
    public final int encoderDelay;

    @UnstableApi
    public final int encoderPadding;
    public final float frameRate;

    @UnstableApi
    public final boolean hasPrerollSamples;
    private int hashCode;
    public final int height;

    @Nullable
    public final String id;

    @UnstableApi
    public final List<byte[]> initializationData;

    @Nullable
    public final String label;

    @UnstableApi
    public final List<Label> labels;

    @Nullable
    public final String language;

    @UnstableApi
    public final int maxInputSize;

    @UnstableApi
    public final int maxNumReorderSamples;

    @UnstableApi
    public final int maxSubLayers;

    @Nullable
    @UnstableApi
    public final Metadata metadata;

    @UnstableApi
    public final int pcmEncoding;

    @UnstableApi
    public final int peakBitrate;
    public final float pixelWidthHeightRatio;

    @Nullable
    @UnstableApi
    public final byte[] projectionData;
    public final int roleFlags;

    @UnstableApi
    public final int rotationDegrees;

    @Nullable
    public final String sampleMimeType;
    public final int sampleRate;
    public final int selectionFlags;

    @UnstableApi
    public final int stereoMode;

    @UnstableApi
    public final long subsampleOffsetUs;

    @UnstableApi
    public final int tileCountHorizontal;

    @UnstableApi
    public final int tileCountVertical;
    public final int width;
    private static final Format DEFAULT = new Builder().build();
    private static final String FIELD_ID = Util.intToStringMaxRadix(0);
    private static final String FIELD_LABEL = Util.intToStringMaxRadix(1);
    private static final String FIELD_LANGUAGE = Util.intToStringMaxRadix(2);
    private static final String FIELD_SELECTION_FLAGS = Util.intToStringMaxRadix(3);
    private static final String FIELD_ROLE_FLAGS = Util.intToStringMaxRadix(4);
    private static final String FIELD_AVERAGE_BITRATE = Util.intToStringMaxRadix(5);
    private static final String FIELD_PEAK_BITRATE = Util.intToStringMaxRadix(6);
    private static final String FIELD_CODECS = Util.intToStringMaxRadix(7);
    private static final String UNUSED_FIELD_METADATA = Util.intToStringMaxRadix(8);
    private static final String FIELD_CONTAINER_MIME_TYPE = Util.intToStringMaxRadix(9);
    private static final String FIELD_SAMPLE_MIME_TYPE = Util.intToStringMaxRadix(10);
    private static final String FIELD_MAX_INPUT_SIZE = Util.intToStringMaxRadix(11);
    private static final String FIELD_INITIALIZATION_DATA = Util.intToStringMaxRadix(12);
    private static final String FIELD_DRM_INIT_DATA = Util.intToStringMaxRadix(13);
    private static final String FIELD_SUBSAMPLE_OFFSET_US = Util.intToStringMaxRadix(14);
    private static final String FIELD_WIDTH = Util.intToStringMaxRadix(15);
    private static final String FIELD_HEIGHT = Util.intToStringMaxRadix(16);
    private static final String FIELD_FRAME_RATE = Util.intToStringMaxRadix(17);
    private static final String FIELD_ROTATION_DEGREES = Util.intToStringMaxRadix(18);
    private static final String FIELD_PIXEL_WIDTH_HEIGHT_RATIO = Util.intToStringMaxRadix(19);
    private static final String FIELD_PROJECTION_DATA = Util.intToStringMaxRadix(20);
    private static final String FIELD_STEREO_MODE = Util.intToStringMaxRadix(21);
    private static final String FIELD_COLOR_INFO = Util.intToStringMaxRadix(22);
    private static final String FIELD_CHANNEL_COUNT = Util.intToStringMaxRadix(23);
    private static final String FIELD_SAMPLE_RATE = Util.intToStringMaxRadix(24);
    private static final String FIELD_PCM_ENCODING = Util.intToStringMaxRadix(25);
    private static final String FIELD_ENCODER_DELAY = Util.intToStringMaxRadix(26);
    private static final String FIELD_ENCODER_PADDING = Util.intToStringMaxRadix(27);
    private static final String FIELD_ACCESSIBILITY_CHANNEL = Util.intToStringMaxRadix(28);
    private static final String FIELD_CRYPTO_TYPE = Util.intToStringMaxRadix(29);
    private static final String FIELD_TILE_COUNT_HORIZONTAL = Util.intToStringMaxRadix(30);
    private static final String FIELD_TILE_COUNT_VERTICAL = Util.intToStringMaxRadix(31);
    private static final String FIELD_LABELS = Util.intToStringMaxRadix(32);
    private static final String FIELD_AUXILIARY_TRACK_TYPE = Util.intToStringMaxRadix(33);
    private static final String FIELD_MAX_SUB_LAYERS = Util.intToStringMaxRadix(34);
    private static final String FIELD_DECODED_WIDTH = Util.intToStringMaxRadix(35);
    private static final String FIELD_DECODED_HEIGHT = Util.intToStringMaxRadix(36);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @UnstableApi
    public static final class Builder {
        private int accessibilityChannel;
        private int auxiliaryTrackType;
        private int averageBitrate;
        private int channelCount;

        @Nullable
        private String codecs;

        @Nullable
        private ColorInfo colorInfo;

        @Nullable
        private String containerMimeType;
        private int cryptoType;

        @UnstableApi
        private int cueReplacementBehavior;

        @Nullable
        private Object customData;
        private int decodedHeight;
        private int decodedWidth;

        @Nullable
        private DrmInitData drmInitData;
        private int encoderDelay;
        private int encoderPadding;
        private float frameRate;
        private boolean hasPrerollSamples;
        private int height;

        @Nullable
        private String id;

        @Nullable
        private List<byte[]> initializationData;

        @Nullable
        private String label;
        private List<Label> labels;

        @Nullable
        private String language;
        private int maxInputSize;
        private int maxNumReorderSamples;
        private int maxSubLayers;

        @Nullable
        private Metadata metadata;
        private int pcmEncoding;
        private int peakBitrate;
        private float pixelWidthHeightRatio;

        @Nullable
        private byte[] projectionData;
        private int roleFlags;
        private int rotationDegrees;

        @Nullable
        private String sampleMimeType;
        private int sampleRate;
        private int selectionFlags;
        private int stereoMode;
        private long subsampleOffsetUs;
        private int tileCountHorizontal;
        private int tileCountVertical;
        private int width;

        public Format build() {
            return new Format(this);
        }

        public Builder setAccessibilityChannel(int i) {
            this.accessibilityChannel = i;
            return this;
        }

        public Builder setAuxiliaryTrackType(int i) {
            this.auxiliaryTrackType = i;
            return this;
        }

        public Builder setAverageBitrate(int i) {
            this.averageBitrate = i;
            return this;
        }

        public Builder setChannelCount(int i) {
            this.channelCount = i;
            return this;
        }

        public Builder setCodecs(@Nullable String str) {
            this.codecs = str;
            return this;
        }

        public Builder setColorInfo(@Nullable ColorInfo colorInfo) {
            this.colorInfo = colorInfo;
            return this;
        }

        public Builder setCryptoType(int i) {
            this.cryptoType = i;
            return this;
        }

        public Builder setCueReplacementBehavior(int i) {
            this.cueReplacementBehavior = i;
            return this;
        }

        @UnstableApi
        public Builder setCustomData(@Nullable Object obj) {
            this.customData = obj;
            return this;
        }

        public Builder setDecodedHeight(int i) {
            this.decodedHeight = i;
            return this;
        }

        public Builder setDecodedWidth(int i) {
            this.decodedWidth = i;
            return this;
        }

        public Builder setDrmInitData(@Nullable DrmInitData drmInitData) {
            this.drmInitData = drmInitData;
            return this;
        }

        public Builder setEncoderDelay(int i) {
            this.encoderDelay = i;
            return this;
        }

        public Builder setEncoderPadding(int i) {
            this.encoderPadding = i;
            return this;
        }

        public Builder setFrameRate(float f) {
            this.frameRate = f;
            return this;
        }

        public Builder setHasPrerollSamples(boolean z) {
            this.hasPrerollSamples = z;
            return this;
        }

        public Builder setHeight(int i) {
            this.height = i;
            return this;
        }

        public Builder setInitializationData(@Nullable List<byte[]> list) {
            this.initializationData = list;
            return this;
        }

        public Builder setLabel(@Nullable String str) {
            this.label = str;
            return this;
        }

        public Builder setLanguage(@Nullable String str) {
            this.language = str;
            return this;
        }

        public Builder setMaxInputSize(int i) {
            this.maxInputSize = i;
            return this;
        }

        public Builder setMaxNumReorderSamples(int i) {
            this.maxNumReorderSamples = i;
            return this;
        }

        public Builder setMaxSubLayers(int i) {
            this.maxSubLayers = i;
            return this;
        }

        public Builder setMetadata(@Nullable Metadata metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setPcmEncoding(int i) {
            this.pcmEncoding = i;
            return this;
        }

        public Builder setPeakBitrate(int i) {
            this.peakBitrate = i;
            return this;
        }

        public Builder setPixelWidthHeightRatio(float f) {
            this.pixelWidthHeightRatio = f;
            return this;
        }

        public Builder setProjectionData(@Nullable byte[] bArr) {
            this.projectionData = bArr;
            return this;
        }

        public Builder setRoleFlags(int i) {
            this.roleFlags = i;
            return this;
        }

        public Builder setRotationDegrees(int i) {
            this.rotationDegrees = i;
            return this;
        }

        public Builder setSampleRate(int i) {
            this.sampleRate = i;
            return this;
        }

        public Builder setSelectionFlags(int i) {
            this.selectionFlags = i;
            return this;
        }

        public Builder setStereoMode(int i) {
            this.stereoMode = i;
            return this;
        }

        public Builder setSubsampleOffsetUs(long j) {
            this.subsampleOffsetUs = j;
            return this;
        }

        public Builder setTileCountHorizontal(int i) {
            this.tileCountHorizontal = i;
            return this;
        }

        public Builder setTileCountVertical(int i) {
            this.tileCountVertical = i;
            return this;
        }

        public Builder setWidth(int i) {
            this.width = i;
            return this;
        }

        private Builder(Format format) {
            this.id = format.id;
            this.label = format.label;
            this.labels = format.labels;
            this.language = format.language;
            this.selectionFlags = format.selectionFlags;
            this.roleFlags = format.roleFlags;
            this.averageBitrate = format.averageBitrate;
            this.peakBitrate = format.peakBitrate;
            this.codecs = format.codecs;
            this.metadata = format.metadata;
            this.customData = format.customData;
            this.containerMimeType = format.containerMimeType;
            this.sampleMimeType = format.sampleMimeType;
            this.maxInputSize = format.maxInputSize;
            this.maxNumReorderSamples = format.maxNumReorderSamples;
            this.initializationData = format.initializationData;
            this.drmInitData = format.drmInitData;
            this.subsampleOffsetUs = format.subsampleOffsetUs;
            this.hasPrerollSamples = format.hasPrerollSamples;
            this.width = format.width;
            this.height = format.height;
            this.decodedWidth = format.decodedWidth;
            this.decodedHeight = format.decodedHeight;
            this.frameRate = format.frameRate;
            this.rotationDegrees = format.rotationDegrees;
            this.pixelWidthHeightRatio = format.pixelWidthHeightRatio;
            this.projectionData = format.projectionData;
            this.stereoMode = format.stereoMode;
            this.colorInfo = format.colorInfo;
            this.maxSubLayers = format.maxSubLayers;
            this.channelCount = format.channelCount;
            this.sampleRate = format.sampleRate;
            this.pcmEncoding = format.pcmEncoding;
            this.encoderDelay = format.encoderDelay;
            this.encoderPadding = format.encoderPadding;
            this.accessibilityChannel = format.accessibilityChannel;
            this.cueReplacementBehavior = format.cueReplacementBehavior;
            this.tileCountHorizontal = format.tileCountHorizontal;
            this.tileCountVertical = format.tileCountVertical;
            this.cryptoType = format.cryptoType;
        }

        public Builder setContainerMimeType(@Nullable String str) {
            this.containerMimeType = MimeTypes.normalizeMimeType(str);
            return this;
        }

        public Builder setId(int i) {
            this.id = Integer.toString(i);
            return this;
        }

        public Builder setLabels(List<Label> list) {
            this.labels = d31.A(list);
            return this;
        }

        public Builder setSampleMimeType(@Nullable String str) {
            this.sampleMimeType = MimeTypes.normalizeMimeType(str);
            return this;
        }

        public Builder setId(@Nullable String str) {
            this.id = str;
            return this;
        }

        public Builder() {
            z21 z21Var = d31.b;
            this.labels = y32.e;
            this.averageBitrate = -1;
            this.peakBitrate = -1;
            this.maxInputSize = -1;
            this.maxNumReorderSamples = -1;
            this.subsampleOffsetUs = Long.MAX_VALUE;
            this.width = -1;
            this.height = -1;
            this.decodedWidth = -1;
            this.decodedHeight = -1;
            this.frameRate = -1.0f;
            this.pixelWidthHeightRatio = 1.0f;
            this.stereoMode = -1;
            this.maxSubLayers = -1;
            this.channelCount = -1;
            this.sampleRate = -1;
            this.pcmEncoding = -1;
            this.accessibilityChannel = -1;
            this.cueReplacementBehavior = 1;
            this.tileCountHorizontal = -1;
            this.tileCountVertical = -1;
            this.cryptoType = 0;
            this.auxiliaryTrackType = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface CueReplacementBehavior {
    }

    public boolean equals(@Nullable Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && Format.class == obj.getClass()) {
            Format format = (Format) obj;
            int i2 = this.hashCode;
            if ((i2 == 0 || (i = format.hashCode) == 0 || i2 == i) && this.selectionFlags == format.selectionFlags && this.roleFlags == format.roleFlags && this.auxiliaryTrackType == format.auxiliaryTrackType && this.averageBitrate == format.averageBitrate && this.peakBitrate == format.peakBitrate && this.maxInputSize == format.maxInputSize && this.subsampleOffsetUs == format.subsampleOffsetUs && this.width == format.width && this.height == format.height && this.decodedWidth == format.decodedWidth && this.decodedHeight == format.decodedHeight && this.rotationDegrees == format.rotationDegrees && this.stereoMode == format.stereoMode && this.maxSubLayers == format.maxSubLayers && this.channelCount == format.channelCount && this.sampleRate == format.sampleRate && this.pcmEncoding == format.pcmEncoding && this.encoderDelay == format.encoderDelay && this.encoderPadding == format.encoderPadding && this.accessibilityChannel == format.accessibilityChannel && this.tileCountHorizontal == format.tileCountHorizontal && this.tileCountVertical == format.tileCountVertical && this.cryptoType == format.cryptoType && Float.compare(this.frameRate, format.frameRate) == 0 && Float.compare(this.pixelWidthHeightRatio, format.pixelWidthHeightRatio) == 0 && Objects.equals(this.id, format.id) && Objects.equals(this.label, format.label) && this.labels.equals(format.labels) && Objects.equals(this.codecs, format.codecs) && Objects.equals(this.containerMimeType, format.containerMimeType) && Objects.equals(this.sampleMimeType, format.sampleMimeType) && Objects.equals(this.language, format.language) && Arrays.equals(this.projectionData, format.projectionData) && Objects.equals(this.metadata, format.metadata) && Objects.equals(this.colorInfo, format.colorInfo) && Objects.equals(this.drmInitData, format.drmInitData) && initializationDataEquals(format) && Objects.equals(this.customData, format.customData)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    private static <T> T defaultIfNull(@Nullable T t, @Nullable T t2) {
        return t != null ? t : t2;
    }

    @UnstableApi
    public static Format fromBundle(Bundle bundle) {
        List<Label> listFromBundleList;
        Builder builder = new Builder();
        BundleCollectionUtil.ensureClassLoader(bundle);
        String string = bundle.getString(FIELD_ID);
        Format format = DEFAULT;
        builder.setId((String) defaultIfNull(string, format.id)).setLabel((String) defaultIfNull(bundle.getString(FIELD_LABEL), format.label));
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_LABELS);
        if (parcelableArrayList == null) {
            z21 z21Var = d31.b;
            listFromBundleList = y32.e;
        } else {
            listFromBundleList = BundleCollectionUtil.fromBundleList(new kk(13), parcelableArrayList);
        }
        builder.setLabels(listFromBundleList).setLanguage((String) defaultIfNull(bundle.getString(FIELD_LANGUAGE), format.language)).setSelectionFlags(bundle.getInt(FIELD_SELECTION_FLAGS, format.selectionFlags)).setRoleFlags(bundle.getInt(FIELD_ROLE_FLAGS, format.roleFlags)).setAuxiliaryTrackType(bundle.getInt(FIELD_AUXILIARY_TRACK_TYPE, format.auxiliaryTrackType)).setAverageBitrate(bundle.getInt(FIELD_AVERAGE_BITRATE, format.averageBitrate)).setPeakBitrate(bundle.getInt(FIELD_PEAK_BITRATE, format.peakBitrate)).setCodecs((String) defaultIfNull(bundle.getString(FIELD_CODECS), format.codecs)).setContainerMimeType((String) defaultIfNull(bundle.getString(FIELD_CONTAINER_MIME_TYPE), format.containerMimeType)).setSampleMimeType((String) defaultIfNull(bundle.getString(FIELD_SAMPLE_MIME_TYPE), format.sampleMimeType)).setMaxInputSize(bundle.getInt(FIELD_MAX_INPUT_SIZE, format.maxInputSize));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(keyForInitializationData(i));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i++;
        }
        Builder drmInitData = builder.setInitializationData(arrayList).setDrmInitData((DrmInitData) bundle.getParcelable(FIELD_DRM_INIT_DATA));
        String str = FIELD_SUBSAMPLE_OFFSET_US;
        Format format2 = DEFAULT;
        drmInitData.setSubsampleOffsetUs(bundle.getLong(str, format2.subsampleOffsetUs)).setWidth(bundle.getInt(FIELD_WIDTH, format2.width)).setHeight(bundle.getInt(FIELD_HEIGHT, format2.height)).setDecodedWidth(bundle.getInt(FIELD_DECODED_WIDTH, format2.decodedWidth)).setDecodedHeight(bundle.getInt(FIELD_DECODED_HEIGHT, format2.decodedHeight)).setFrameRate(bundle.getFloat(FIELD_FRAME_RATE, format2.frameRate)).setRotationDegrees(bundle.getInt(FIELD_ROTATION_DEGREES, format2.rotationDegrees)).setPixelWidthHeightRatio(bundle.getFloat(FIELD_PIXEL_WIDTH_HEIGHT_RATIO, format2.pixelWidthHeightRatio)).setProjectionData(bundle.getByteArray(FIELD_PROJECTION_DATA)).setStereoMode(bundle.getInt(FIELD_STEREO_MODE, format2.stereoMode)).setMaxSubLayers(bundle.getInt(FIELD_MAX_SUB_LAYERS, format2.maxSubLayers));
        Bundle bundle2 = bundle.getBundle(FIELD_COLOR_INFO);
        if (bundle2 != null) {
            builder.setColorInfo(ColorInfo.fromBundle(bundle2));
        }
        builder.setChannelCount(bundle.getInt(FIELD_CHANNEL_COUNT, format2.channelCount)).setSampleRate(bundle.getInt(FIELD_SAMPLE_RATE, format2.sampleRate)).setPcmEncoding(bundle.getInt(FIELD_PCM_ENCODING, format2.pcmEncoding)).setEncoderDelay(bundle.getInt(FIELD_ENCODER_DELAY, format2.encoderDelay)).setEncoderPadding(bundle.getInt(FIELD_ENCODER_PADDING, format2.encoderPadding)).setAccessibilityChannel(bundle.getInt(FIELD_ACCESSIBILITY_CHANNEL, format2.accessibilityChannel)).setTileCountHorizontal(bundle.getInt(FIELD_TILE_COUNT_HORIZONTAL, format2.tileCountHorizontal)).setTileCountVertical(bundle.getInt(FIELD_TILE_COUNT_VERTICAL, format2.tileCountVertical)).setCryptoType(bundle.getInt(FIELD_CRYPTO_TYPE, format2.cryptoType));
        return builder.build();
    }

    private static String keyForInitializationData(int i) {
        return FIELD_INITIALIZATION_DATA + "_" + Integer.toString(i, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$toLogString$0(Label label) {
        return label.language + ": " + label.value;
    }

    @UnstableApi
    public static String toLogString(@Nullable Format format) {
        if (format == null) {
            return "null";
        }
        p91 p91VarC = p91.c();
        StringBuilder sbP = h50.p("id=");
        sbP.append(format.id);
        sbP.append(", mimeType=");
        sbP.append(format.sampleMimeType);
        if (format.containerMimeType != null) {
            sbP.append(", container=");
            sbP.append(format.containerMimeType);
        }
        if (format.bitrate != -1) {
            sbP.append(", bitrate=");
            sbP.append(format.bitrate);
        }
        if (format.codecs != null) {
            sbP.append(", codecs=");
            sbP.append(format.codecs);
        }
        if (format.drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (true) {
                DrmInitData drmInitData = format.drmInitData;
                if (i >= drmInitData.schemeDataCount) {
                    break;
                }
                UUID uuid = drmInitData.get(i).uuid;
                if (uuid.equals(C.COMMON_PSSH_UUID)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(C.CLEARKEY_UUID)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(C.PLAYREADY_UUID)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(C.WIDEVINE_UUID)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(C.UUID_NIL)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
                i++;
            }
            sbP.append(", drm=[");
            p91VarC.a(sbP, linkedHashSet.iterator());
            sbP.append(']');
        }
        if (format.width != -1 && format.height != -1) {
            sbP.append(", res=");
            sbP.append(format.width);
            sbP.append("x");
            sbP.append(format.height);
        }
        if (format.decodedWidth != -1 && format.decodedHeight != -1) {
            sbP.append(", decRes=");
            sbP.append(format.decodedWidth);
            sbP.append("x");
            sbP.append(format.decodedHeight);
        }
        if (!kd0.a(format.pixelWidthHeightRatio)) {
            sbP.append(", par=");
            sbP.append(Util.formatInvariant("%.3f", Float.valueOf(format.pixelWidthHeightRatio)));
        }
        ColorInfo colorInfo = format.colorInfo;
        if (colorInfo != null && colorInfo.isValid()) {
            sbP.append(", color=");
            sbP.append(format.colorInfo.toLogString());
        }
        if (format.frameRate != -1.0f) {
            sbP.append(", fps=");
            sbP.append(format.frameRate);
        }
        if (format.maxSubLayers != -1) {
            sbP.append(", maxSubLayers=");
            sbP.append(format.maxSubLayers);
        }
        if (format.channelCount != -1) {
            sbP.append(", channels=");
            sbP.append(format.channelCount);
        }
        if (format.sampleRate != -1) {
            sbP.append(", sample_rate=");
            sbP.append(format.sampleRate);
        }
        if (format.language != null) {
            sbP.append(", language=");
            sbP.append(format.language);
        }
        if (!format.labels.isEmpty()) {
            sbP.append(", labels=[");
            p91VarC.a(sbP, l7.H(format.labels, new kk(14)).iterator());
            sbP.append(C4664b4.j.e);
        }
        if (format.selectionFlags != 0) {
            sbP.append(", selectionFlags=[");
            p91VarC.a(sbP, Util.getSelectionFlagStrings(format.selectionFlags).iterator());
            sbP.append(C4664b4.j.e);
        }
        if (format.roleFlags != 0) {
            sbP.append(", roleFlags=[");
            p91VarC.a(sbP, Util.getRoleFlagStrings(format.roleFlags).iterator());
            sbP.append(C4664b4.j.e);
        }
        if (format.customData != null) {
            sbP.append(", customData=");
            sbP.append(format.customData);
        }
        if ((format.roleFlags & 32768) != 0) {
            sbP.append(", auxiliaryTrackType=");
            sbP.append(Util.getAuxiliaryTrackTypeString(format.auxiliaryTrackType));
        }
        return sbP.toString();
    }

    @UnstableApi
    public Builder buildUpon() {
        return new Builder();
    }

    @UnstableApi
    public int getPixelCount() {
        int i;
        int i2 = this.width;
        if (i2 == -1 || (i = this.height) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            String str = this.id;
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.label;
            int iHashCode2 = (this.labels.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.language;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.selectionFlags) * 31) + this.roleFlags) * 31) + this.auxiliaryTrackType) * 31) + this.averageBitrate) * 31) + this.peakBitrate) * 31;
            String str4 = this.codecs;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.metadata;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            Object obj = this.customData;
            int iHashCode6 = (iHashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
            String str5 = this.containerMimeType;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.sampleMimeType;
            this.hashCode = ((((((((((((((((((((((Float.floatToIntBits(this.pixelWidthHeightRatio) + ((((Float.floatToIntBits(this.frameRate) + ((((((((((((((iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.maxInputSize) * 31) + ((int) this.subsampleOffsetUs)) * 31) + this.width) * 31) + this.height) * 31) + this.decodedWidth) * 31) + this.decodedHeight) * 31)) * 31) + this.rotationDegrees) * 31)) * 31) + this.stereoMode) * 31) + this.maxSubLayers) * 31) + this.channelCount) * 31) + this.sampleRate) * 31) + this.pcmEncoding) * 31) + this.encoderDelay) * 31) + this.encoderPadding) * 31) + this.accessibilityChannel) * 31) + this.tileCountHorizontal) * 31) + this.tileCountVertical) * 31) + this.cryptoType;
        }
        return this.hashCode;
    }

    @UnstableApi
    public boolean initializationDataEquals(Format format) {
        if (this.initializationData.size() != format.initializationData.size()) {
            return false;
        }
        for (int i = 0; i < this.initializationData.size(); i++) {
            if (!Arrays.equals(this.initializationData.get(i), format.initializationData.get(i))) {
                return false;
            }
        }
        return true;
    }

    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(FIELD_ID, this.id);
        bundle.putString(FIELD_LABEL, this.label);
        bundle.putParcelableArrayList(FIELD_LABELS, BundleCollectionUtil.toBundleArrayList(this.labels, new kk(12)));
        bundle.putString(FIELD_LANGUAGE, this.language);
        bundle.putInt(FIELD_SELECTION_FLAGS, this.selectionFlags);
        bundle.putInt(FIELD_ROLE_FLAGS, this.roleFlags);
        int i = this.auxiliaryTrackType;
        if (i != DEFAULT.auxiliaryTrackType) {
            bundle.putInt(FIELD_AUXILIARY_TRACK_TYPE, i);
        }
        bundle.putInt(FIELD_AVERAGE_BITRATE, this.averageBitrate);
        bundle.putInt(FIELD_PEAK_BITRATE, this.peakBitrate);
        bundle.putString(FIELD_CODECS, this.codecs);
        bundle.putString(FIELD_CONTAINER_MIME_TYPE, this.containerMimeType);
        bundle.putString(FIELD_SAMPLE_MIME_TYPE, this.sampleMimeType);
        bundle.putInt(FIELD_MAX_INPUT_SIZE, this.maxInputSize);
        for (int i2 = 0; i2 < this.initializationData.size(); i2++) {
            bundle.putByteArray(keyForInitializationData(i2), this.initializationData.get(i2));
        }
        bundle.putParcelable(FIELD_DRM_INIT_DATA, this.drmInitData);
        bundle.putLong(FIELD_SUBSAMPLE_OFFSET_US, this.subsampleOffsetUs);
        bundle.putInt(FIELD_WIDTH, this.width);
        bundle.putInt(FIELD_HEIGHT, this.height);
        bundle.putInt(FIELD_DECODED_WIDTH, this.decodedWidth);
        bundle.putInt(FIELD_DECODED_HEIGHT, this.decodedHeight);
        bundle.putFloat(FIELD_FRAME_RATE, this.frameRate);
        bundle.putInt(FIELD_ROTATION_DEGREES, this.rotationDegrees);
        bundle.putFloat(FIELD_PIXEL_WIDTH_HEIGHT_RATIO, this.pixelWidthHeightRatio);
        bundle.putByteArray(FIELD_PROJECTION_DATA, this.projectionData);
        bundle.putInt(FIELD_STEREO_MODE, this.stereoMode);
        ColorInfo colorInfo = this.colorInfo;
        if (colorInfo != null) {
            bundle.putBundle(FIELD_COLOR_INFO, colorInfo.toBundle());
        }
        bundle.putInt(FIELD_MAX_SUB_LAYERS, this.maxSubLayers);
        bundle.putInt(FIELD_CHANNEL_COUNT, this.channelCount);
        bundle.putInt(FIELD_SAMPLE_RATE, this.sampleRate);
        bundle.putInt(FIELD_PCM_ENCODING, this.pcmEncoding);
        bundle.putInt(FIELD_ENCODER_DELAY, this.encoderDelay);
        bundle.putInt(FIELD_ENCODER_PADDING, this.encoderPadding);
        bundle.putInt(FIELD_ACCESSIBILITY_CHANNEL, this.accessibilityChannel);
        bundle.putInt(FIELD_TILE_COUNT_HORIZONTAL, this.tileCountHorizontal);
        bundle.putInt(FIELD_TILE_COUNT_VERTICAL, this.tileCountVertical);
        bundle.putInt(FIELD_CRYPTO_TYPE, this.cryptoType);
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.id);
        sb.append(", ");
        sb.append(this.label);
        sb.append(", ");
        sb.append(this.containerMimeType);
        sb.append(", ");
        sb.append(this.sampleMimeType);
        sb.append(", ");
        sb.append(this.codecs);
        sb.append(", ");
        sb.append(this.bitrate);
        sb.append(", ");
        sb.append(this.language);
        sb.append(", [");
        sb.append(this.width);
        sb.append(", ");
        sb.append(this.height);
        sb.append(", ");
        sb.append(this.frameRate);
        sb.append(", ");
        sb.append(this.colorInfo);
        sb.append("], [");
        sb.append(this.channelCount);
        sb.append(", ");
        return nj.l(this.sampleRate, "])", sb);
    }

    @UnstableApi
    public Format withManifestFormatInfo(Format format) {
        String str;
        if (this == format) {
            return this;
        }
        int trackType = MimeTypes.getTrackType(this.sampleMimeType);
        String str2 = format.id;
        int i = format.tileCountHorizontal;
        int i2 = format.tileCountVertical;
        String str3 = format.label;
        if (str3 == null) {
            str3 = this.label;
        }
        List<Label> list = !format.labels.isEmpty() ? format.labels : this.labels;
        String str4 = this.language;
        if ((trackType == 3 || trackType == 1) && (str = format.language) != null) {
            str4 = str;
        }
        int i3 = this.averageBitrate;
        if (i3 == -1) {
            i3 = format.averageBitrate;
        }
        int i4 = this.peakBitrate;
        if (i4 == -1) {
            i4 = format.peakBitrate;
        }
        String str5 = this.codecs;
        if (str5 == null) {
            String codecsOfType = Util.getCodecsOfType(format.codecs, trackType);
            if (Util.splitCodecs(codecsOfType).length == 1) {
                str5 = codecsOfType;
            }
        }
        Metadata metadata = this.metadata;
        Metadata metadataCopyWithAppendedEntriesFrom = format.metadata;
        if (metadata != null) {
            metadataCopyWithAppendedEntriesFrom = metadata.copyWithAppendedEntriesFrom(metadataCopyWithAppendedEntriesFrom);
        }
        float f = this.frameRate;
        if (f == -1.0f && trackType == 2) {
            f = format.frameRate;
        }
        return buildUpon().setId(str2).setLabel(str3).setLabels(list).setLanguage(str4).setSelectionFlags(this.selectionFlags | format.selectionFlags).setRoleFlags(this.roleFlags | format.roleFlags).setAverageBitrate(i3).setPeakBitrate(i4).setCodecs(str5).setMetadata(metadataCopyWithAppendedEntriesFrom).setDrmInitData(DrmInitData.createSessionCreationData(format.drmInitData, this.drmInitData)).setFrameRate(f).setTileCountHorizontal(i).setTileCountVertical(i2).build();
    }

    private Format(Builder builder) {
        boolean z;
        List<byte[]> list;
        int i;
        float f;
        int i2;
        this.id = builder.id;
        String strNormalizeLanguageCode = Util.normalizeLanguageCode(builder.language);
        this.language = strNormalizeLanguageCode;
        if (builder.labels.isEmpty() && builder.label != null) {
            this.labels = d31.E(new Label(strNormalizeLanguageCode, builder.label));
            this.label = builder.label;
        } else if (!builder.labels.isEmpty() && builder.label == null) {
            this.labels = builder.labels;
            this.label = getDefaultLabel(builder.labels, strNormalizeLanguageCode);
        } else {
            Assertions.checkState(isLabelPartOfLabels(builder));
            this.labels = builder.labels;
            this.label = builder.label;
        }
        this.selectionFlags = builder.selectionFlags;
        if (builder.auxiliaryTrackType != 0 && (builder.roleFlags & 32768) == 0) {
            z = false;
        } else {
            z = true;
        }
        Assertions.checkState(z, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.roleFlags = builder.roleFlags;
        this.auxiliaryTrackType = builder.auxiliaryTrackType;
        int i3 = builder.averageBitrate;
        this.averageBitrate = i3;
        int i4 = builder.peakBitrate;
        this.peakBitrate = i4;
        this.bitrate = i4 != -1 ? i4 : i3;
        this.codecs = builder.codecs;
        this.metadata = builder.metadata;
        this.customData = builder.customData;
        this.containerMimeType = builder.containerMimeType;
        this.sampleMimeType = builder.sampleMimeType;
        this.maxInputSize = builder.maxInputSize;
        this.maxNumReorderSamples = builder.maxNumReorderSamples;
        if (builder.initializationData != null) {
            list = builder.initializationData;
        } else {
            list = Collections.EMPTY_LIST;
        }
        this.initializationData = list;
        DrmInitData drmInitData = builder.drmInitData;
        this.drmInitData = drmInitData;
        this.subsampleOffsetUs = builder.subsampleOffsetUs;
        this.hasPrerollSamples = builder.hasPrerollSamples;
        this.width = builder.width;
        this.height = builder.height;
        this.decodedWidth = builder.decodedWidth;
        this.decodedHeight = builder.decodedHeight;
        this.frameRate = builder.frameRate;
        if (builder.rotationDegrees != -1) {
            i = builder.rotationDegrees;
        } else {
            i = 0;
        }
        this.rotationDegrees = i;
        if (builder.pixelWidthHeightRatio != -1.0f) {
            f = builder.pixelWidthHeightRatio;
        } else {
            f = 1.0f;
        }
        this.pixelWidthHeightRatio = f;
        this.projectionData = builder.projectionData;
        this.stereoMode = builder.stereoMode;
        this.colorInfo = builder.colorInfo;
        this.maxSubLayers = builder.maxSubLayers;
        this.channelCount = builder.channelCount;
        this.sampleRate = builder.sampleRate;
        this.pcmEncoding = builder.pcmEncoding;
        if (builder.encoderDelay != -1) {
            i2 = builder.encoderDelay;
        } else {
            i2 = 0;
        }
        this.encoderDelay = i2;
        this.encoderPadding = builder.encoderPadding != -1 ? builder.encoderPadding : 0;
        this.accessibilityChannel = builder.accessibilityChannel;
        this.cueReplacementBehavior = builder.cueReplacementBehavior;
        this.tileCountHorizontal = builder.tileCountHorizontal;
        this.tileCountVertical = builder.tileCountVertical;
        if (builder.cryptoType == 0 && drmInitData != null) {
            this.cryptoType = 1;
        } else {
            this.cryptoType = builder.cryptoType;
        }
    }

    private static String getDefaultLabel(List<Label> list, @Nullable String str) {
        for (Label label : list) {
            if (TextUtils.equals(label.language, str)) {
                return label.value;
            }
        }
        return list.get(0).value;
    }

    private static boolean isLabelPartOfLabels(Builder builder) {
        if (builder.labels.isEmpty() && builder.label == null) {
            return true;
        }
        for (int i = 0; i < builder.labels.size(); i++) {
            if (((Label) builder.labels.get(i)).value.equals(builder.label)) {
                return true;
            }
        }
        return false;
    }

    @UnstableApi
    public Format copyWithCryptoType(int i) {
        return buildUpon().setCryptoType(i).build();
    }
}
