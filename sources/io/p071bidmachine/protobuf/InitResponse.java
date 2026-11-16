package io.p071bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.a6;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.c;
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.d6;
import com.explorestack.protobuf.g4;
import com.explorestack.protobuf.g7;
import com.explorestack.protobuf.h4;
import com.explorestack.protobuf.k6;
import com.explorestack.protobuf.l5;
import com.explorestack.protobuf.l9;
import com.explorestack.protobuf.o3;
import com.explorestack.protobuf.o7;
import com.explorestack.protobuf.p8;
import com.explorestack.protobuf.r;
import com.explorestack.protobuf.s8;
import com.explorestack.protobuf.v7;
import com.explorestack.protobuf.w;
import com.explorestack.protobuf.w4;
import com.explorestack.protobuf.x4;
import com.explorestack.protobuf.y4;
import com.explorestack.protobuf.z;
import defpackage.e32;
import defpackage.pv1;
import io.p071bidmachine.media3.extractor.ts.y;
import io.p071bidmachine.protobuf.sdk.AssetCache;
import io.p071bidmachine.protobuf.sdk.Configuration;
import io.p071bidmachine.protobuf.sdk.ConfigurationOrBuilder;
import io.p071bidmachine.protobuf.sdk.RestrictionMode;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class InitResponse extends y4 implements InitResponseOrBuilder {
    public static final int AD_CACHE_CONTROL_FIELD_NUMBER = 5;
    public static final int AD_CACHE_MAX_AGE_FIELD_NUMBER = 6;
    public static final int AD_CACHE_PLACEMENT_CONTROL_FIELD_NUMBER = 8;
    public static final int AD_NETWORKS_FIELD_NUMBER = 4;
    public static final int AD_NETWORKS_LOADING_TIMEOUT_FIELD_NUMBER = 9;
    public static final int AD_REQUEST_TMAX_FIELD_NUMBER = 7;
    public static final int ASSET_CACHE_CONFIGURATION_FIELD_NUMBER = 16;
    public static final int BMIFV_TTL_SESSIONS_FIELD_NUMBER = 18;
    public static final int CRASH_SIGNAL_CONFIG_FIELD_NUMBER = 19;
    public static final int ENDPOINT_FIELD_NUMBER = 1;
    public static final int EVENT_CONFIGURATION_FIELD_NUMBER = 11;
    public static final int EVENT_FIELD_NUMBER = 2;
    public static final int EXTRAS_FIELD_NUMBER = 14;
    public static final int RESTRICTION_MODE_FIELD_NUMBER = 17;
    public static final int SDK_ANALYTIC_CONFIG_FIELD_NUMBER = 10;
    public static final int SDK_ANALYTIC_CONFIG_V2_FIELD_NUMBER = 15;
    public static final int SESSION_RESET_AFTER_FIELD_NUMBER = 3;
    public static final int SHOW_WITHOUT_INTERNET_FIELD_NUMBER = 13;
    public static final int TOKEN_CONFIGURATIONS_FIELD_NUMBER = 12;
    private static final long serialVersionUID = 0;
    private int adCacheControl_;
    private int adCacheMaxAge_;
    private k6 adCachePlacementControl_;
    private int adNetworksLoadingTimeout_;
    private List<AdNetwork> adNetworks_;
    private int adRequestTmax_;
    private AssetCache.Configuration assetCacheConfiguration_;
    private int bmifvTtlSessions_;
    private SdkCrashSignalConfig crashSignalConfig_;
    private volatile Object endpoint_;
    private AdExtension.EventConfiguration eventConfiguration_;
    private List<Ad.Event> event_;
    private Extras extras_;
    private byte memoizedIsInitialized;
    private int restrictionMode_;
    private Configuration sdkAnalyticConfigV2_;
    private SdkAnalyticConfig sdkAnalyticConfig_;
    private int sessionResetAfter_;
    private boolean showWithoutInternet_;
    private List<TokenConfiguration> tokenConfigurations_;
    private static final InitResponse DEFAULT_INSTANCE = new InitResponse();
    private static final g7 PARSER = new d() { // from class: io.bidmachine.protobuf.InitResponse.1
        @Override // com.explorestack.protobuf.g7
        public InitResponse parsePartialFrom(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
            return new InitResponse(rVar, o3Var);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder extends g4 implements InitResponseOrBuilder {
        private int adCacheControl_;
        private int adCacheMaxAge_;
        private k6 adCachePlacementControl_;
        private o7 adNetworksBuilder_;
        private int adNetworksLoadingTimeout_;
        private List<AdNetwork> adNetworks_;
        private int adRequestTmax_;
        private v7 assetCacheConfigurationBuilder_;
        private AssetCache.Configuration assetCacheConfiguration_;
        private int bitField0_;
        private int bmifvTtlSessions_;
        private v7 crashSignalConfigBuilder_;
        private SdkCrashSignalConfig crashSignalConfig_;
        private Object endpoint_;
        private o7 eventBuilder_;
        private v7 eventConfigurationBuilder_;
        private AdExtension.EventConfiguration eventConfiguration_;
        private List<Ad.Event> event_;
        private v7 extrasBuilder_;
        private Extras extras_;
        private int restrictionMode_;
        private v7 sdkAnalyticConfigBuilder_;
        private v7 sdkAnalyticConfigV2Builder_;
        private Configuration sdkAnalyticConfigV2_;
        private SdkAnalyticConfig sdkAnalyticConfig_;
        private int sessionResetAfter_;
        private boolean showWithoutInternet_;
        private o7 tokenConfigurationsBuilder_;
        private List<TokenConfiguration> tokenConfigurations_;

        private Builder() {
            super(null);
            this.endpoint_ = "";
            List list = Collections.EMPTY_LIST;
            this.event_ = list;
            this.adNetworks_ = list;
            this.adCacheControl_ = 0;
            this.tokenConfigurations_ = list;
            this.restrictionMode_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder clearAdCacheControl() {
            this.adCacheControl_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAdCacheMaxAge() {
            this.adCacheMaxAge_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAdNetworksLoadingTimeout() {
            this.adNetworksLoadingTimeout_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAdRequestTmax() {
            this.adRequestTmax_ = 0;
            onChanged();
            return this;
        }

        public Builder clearBmifvTtlSessions() {
            this.bmifvTtlSessions_ = 0;
            onChanged();
            return this;
        }

        public Builder clearRestrictionMode() {
            this.restrictionMode_ = 0;
            onChanged();
            return this;
        }

        public Builder clearSessionResetAfter() {
            this.sessionResetAfter_ = 0;
            onChanged();
            return this;
        }

        public Builder clearShowWithoutInternet() {
            this.showWithoutInternet_ = false;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        private void ensureAdNetworksIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.adNetworks_ = new ArrayList(this.adNetworks_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureEventIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.event_ = new ArrayList(this.event_);
                this.bitField0_ |= 1;
            }
        }

        private void ensureTokenConfigurationsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.tokenConfigurations_ = new ArrayList(this.tokenConfigurations_);
                this.bitField0_ |= 8;
            }
        }

        private o7 getAdNetworksFieldBuilder() {
            if (this.adNetworksBuilder_ == null) {
                this.adNetworksBuilder_ = new o7(this.adNetworks_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.adNetworks_ = null;
            }
            return this.adNetworksBuilder_;
        }

        private v7 getAssetCacheConfigurationFieldBuilder() {
            if (this.assetCacheConfigurationBuilder_ == null) {
                this.assetCacheConfigurationBuilder_ = new v7(getAssetCacheConfiguration(), getParentForChildren(), isClean());
                this.assetCacheConfiguration_ = null;
            }
            return this.assetCacheConfigurationBuilder_;
        }

        private v7 getCrashSignalConfigFieldBuilder() {
            if (this.crashSignalConfigBuilder_ == null) {
                this.crashSignalConfigBuilder_ = new v7(getCrashSignalConfig(), getParentForChildren(), isClean());
                this.crashSignalConfig_ = null;
            }
            return this.crashSignalConfigBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_InitResponse_descriptor;
        }

        private v7 getEventConfigurationFieldBuilder() {
            if (this.eventConfigurationBuilder_ == null) {
                this.eventConfigurationBuilder_ = new v7(getEventConfiguration(), getParentForChildren(), isClean());
                this.eventConfiguration_ = null;
            }
            return this.eventConfigurationBuilder_;
        }

        private o7 getEventFieldBuilder() {
            if (this.eventBuilder_ == null) {
                this.eventBuilder_ = new o7(this.event_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.event_ = null;
            }
            return this.eventBuilder_;
        }

        private v7 getExtrasFieldBuilder() {
            if (this.extrasBuilder_ == null) {
                this.extrasBuilder_ = new v7(getExtras(), getParentForChildren(), isClean());
                this.extras_ = null;
            }
            return this.extrasBuilder_;
        }

        private v7 getSdkAnalyticConfigFieldBuilder() {
            if (this.sdkAnalyticConfigBuilder_ == null) {
                this.sdkAnalyticConfigBuilder_ = new v7(getSdkAnalyticConfig(), getParentForChildren(), isClean());
                this.sdkAnalyticConfig_ = null;
            }
            return this.sdkAnalyticConfigBuilder_;
        }

        private v7 getSdkAnalyticConfigV2FieldBuilder() {
            if (this.sdkAnalyticConfigV2Builder_ == null) {
                this.sdkAnalyticConfigV2Builder_ = new v7(getSdkAnalyticConfigV2(), getParentForChildren(), isClean());
                this.sdkAnalyticConfigV2_ = null;
            }
            return this.sdkAnalyticConfigV2Builder_;
        }

        private o7 getTokenConfigurationsFieldBuilder() {
            if (this.tokenConfigurationsBuilder_ == null) {
                this.tokenConfigurationsBuilder_ = new o7(this.tokenConfigurations_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                this.tokenConfigurations_ = null;
            }
            return this.tokenConfigurationsBuilder_;
        }

        private k6 internalGetAdCachePlacementControl() {
            k6 k6Var = this.adCachePlacementControl_;
            return k6Var == null ? k6.e(AdCachePlacementControlDefaultEntryHolder.defaultEntry) : k6Var;
        }

        public Builder addAdNetworks(AdNetwork.Builder builder) {
            o7 o7Var = this.adNetworksBuilder_;
            if (o7Var != null) {
                o7Var.e(builder.build());
                return this;
            }
            ensureAdNetworksIsMutable();
            this.adNetworks_.add(builder.build());
            onChanged();
            return this;
        }

        public Builder addAllAdNetworks(Iterable<? extends AdNetwork> iterable) {
            o7 o7Var = this.adNetworksBuilder_;
            if (o7Var != null) {
                o7Var.a(iterable);
                return this;
            }
            ensureAdNetworksIsMutable();
            b.addAll((Iterable) iterable, (List) this.adNetworks_);
            onChanged();
            return this;
        }

        public Builder addAllEvent(Iterable<? extends Ad.Event> iterable) {
            o7 o7Var = this.eventBuilder_;
            if (o7Var != null) {
                o7Var.a(iterable);
                return this;
            }
            ensureEventIsMutable();
            b.addAll((Iterable) iterable, (List) this.event_);
            onChanged();
            return this;
        }

        public Builder addAllTokenConfigurations(Iterable<? extends TokenConfiguration> iterable) {
            o7 o7Var = this.tokenConfigurationsBuilder_;
            if (o7Var != null) {
                o7Var.a(iterable);
                return this;
            }
            ensureTokenConfigurationsIsMutable();
            b.addAll((Iterable) iterable, (List) this.tokenConfigurations_);
            onChanged();
            return this;
        }

        public Builder addEvent(Ad.Event.Builder builder) {
            o7 o7Var = this.eventBuilder_;
            if (o7Var != null) {
                o7Var.e(builder.build());
                return this;
            }
            ensureEventIsMutable();
            this.event_.add(builder.build());
            onChanged();
            return this;
        }

        public Builder addTokenConfigurations(TokenConfiguration.Builder builder) {
            o7 o7Var = this.tokenConfigurationsBuilder_;
            if (o7Var != null) {
                o7Var.e(builder.build());
                return this;
            }
            ensureTokenConfigurationsIsMutable();
            this.tokenConfigurations_.add(builder.build());
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public InitResponse buildPartial() {
            InitResponse initResponse = new InitResponse(this);
            initResponse.endpoint_ = this.endpoint_;
            o7 o7Var = this.eventBuilder_;
            if (o7Var == null) {
                if ((this.bitField0_ & 1) != 0) {
                    this.event_ = Collections.unmodifiableList(this.event_);
                    this.bitField0_ &= -2;
                }
                initResponse.event_ = this.event_;
            } else {
                initResponse.event_ = o7Var.f();
            }
            initResponse.sessionResetAfter_ = this.sessionResetAfter_;
            o7 o7Var2 = this.adNetworksBuilder_;
            if (o7Var2 == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.adNetworks_ = Collections.unmodifiableList(this.adNetworks_);
                    this.bitField0_ &= -3;
                }
                initResponse.adNetworks_ = this.adNetworks_;
            } else {
                initResponse.adNetworks_ = o7Var2.f();
            }
            initResponse.adCacheControl_ = this.adCacheControl_;
            initResponse.adCacheMaxAge_ = this.adCacheMaxAge_;
            initResponse.adRequestTmax_ = this.adRequestTmax_;
            initResponse.adCachePlacementControl_ = internalGetAdCachePlacementControl();
            initResponse.adCachePlacementControl_.a = false;
            initResponse.adNetworksLoadingTimeout_ = this.adNetworksLoadingTimeout_;
            v7 v7Var = this.sdkAnalyticConfigBuilder_;
            if (v7Var == null) {
                initResponse.sdkAnalyticConfig_ = this.sdkAnalyticConfig_;
            } else {
                initResponse.sdkAnalyticConfig_ = (SdkAnalyticConfig) v7Var.a();
            }
            v7 v7Var2 = this.eventConfigurationBuilder_;
            if (v7Var2 == null) {
                initResponse.eventConfiguration_ = this.eventConfiguration_;
            } else {
                initResponse.eventConfiguration_ = (AdExtension.EventConfiguration) v7Var2.a();
            }
            o7 o7Var3 = this.tokenConfigurationsBuilder_;
            if (o7Var3 == null) {
                if ((this.bitField0_ & 8) != 0) {
                    this.tokenConfigurations_ = Collections.unmodifiableList(this.tokenConfigurations_);
                    this.bitField0_ &= -9;
                }
                initResponse.tokenConfigurations_ = this.tokenConfigurations_;
            } else {
                initResponse.tokenConfigurations_ = o7Var3.f();
            }
            initResponse.showWithoutInternet_ = this.showWithoutInternet_;
            v7 v7Var3 = this.extrasBuilder_;
            if (v7Var3 == null) {
                initResponse.extras_ = this.extras_;
            } else {
                initResponse.extras_ = (Extras) v7Var3.a();
            }
            v7 v7Var4 = this.sdkAnalyticConfigV2Builder_;
            if (v7Var4 == null) {
                initResponse.sdkAnalyticConfigV2_ = this.sdkAnalyticConfigV2_;
            } else {
                initResponse.sdkAnalyticConfigV2_ = (Configuration) v7Var4.a();
            }
            v7 v7Var5 = this.assetCacheConfigurationBuilder_;
            if (v7Var5 == null) {
                initResponse.assetCacheConfiguration_ = this.assetCacheConfiguration_;
            } else {
                initResponse.assetCacheConfiguration_ = (AssetCache.Configuration) v7Var5.a();
            }
            initResponse.restrictionMode_ = this.restrictionMode_;
            initResponse.bmifvTtlSessions_ = this.bmifvTtlSessions_;
            v7 v7Var6 = this.crashSignalConfigBuilder_;
            if (v7Var6 == null) {
                initResponse.crashSignalConfig_ = this.crashSignalConfig_;
            } else {
                initResponse.crashSignalConfig_ = (SdkCrashSignalConfig) v7Var6.a();
            }
            onBuilt();
            return initResponse;
        }

        public Builder clearAdNetworks() {
            o7 o7Var = this.adNetworksBuilder_;
            if (o7Var != null) {
                o7Var.g();
                return this;
            }
            this.adNetworks_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearAssetCacheConfiguration() {
            if (this.assetCacheConfigurationBuilder_ == null) {
                this.assetCacheConfiguration_ = null;
                onChanged();
                return this;
            }
            this.assetCacheConfiguration_ = null;
            this.assetCacheConfigurationBuilder_ = null;
            return this;
        }

        public Builder clearCrashSignalConfig() {
            if (this.crashSignalConfigBuilder_ == null) {
                this.crashSignalConfig_ = null;
                onChanged();
                return this;
            }
            this.crashSignalConfig_ = null;
            this.crashSignalConfigBuilder_ = null;
            return this;
        }

        public Builder clearEvent() {
            o7 o7Var = this.eventBuilder_;
            if (o7Var != null) {
                o7Var.g();
                return this;
            }
            this.event_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearEventConfiguration() {
            if (this.eventConfigurationBuilder_ == null) {
                this.eventConfiguration_ = null;
                onChanged();
                return this;
            }
            this.eventConfiguration_ = null;
            this.eventConfigurationBuilder_ = null;
            return this;
        }

        public Builder clearExtras() {
            if (this.extrasBuilder_ == null) {
                this.extras_ = null;
                onChanged();
                return this;
            }
            this.extras_ = null;
            this.extrasBuilder_ = null;
            return this;
        }

        public Builder clearSdkAnalyticConfig() {
            if (this.sdkAnalyticConfigBuilder_ == null) {
                this.sdkAnalyticConfig_ = null;
                onChanged();
                return this;
            }
            this.sdkAnalyticConfig_ = null;
            this.sdkAnalyticConfigBuilder_ = null;
            return this;
        }

        public Builder clearSdkAnalyticConfigV2() {
            if (this.sdkAnalyticConfigV2Builder_ == null) {
                this.sdkAnalyticConfigV2_ = null;
                onChanged();
                return this;
            }
            this.sdkAnalyticConfigV2_ = null;
            this.sdkAnalyticConfigV2Builder_ = null;
            return this;
        }

        public Builder clearTokenConfigurations() {
            o7 o7Var = this.tokenConfigurationsBuilder_;
            if (o7Var != null) {
                o7Var.g();
                return this;
            }
            this.tokenConfigurations_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public AdCacheControl getAdCacheControl() {
            AdCacheControl adCacheControlValueOf = AdCacheControl.valueOf(this.adCacheControl_);
            return adCacheControlValueOf == null ? AdCacheControl.UNRECOGNIZED : adCacheControlValueOf;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public int getAdCacheControlValue() {
            return this.adCacheControl_;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public int getAdCacheMaxAge() {
            return this.adCacheMaxAge_;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public AdNetwork getAdNetworks(int i) {
            o7 o7Var = this.adNetworksBuilder_;
            return o7Var == null ? this.adNetworks_.get(i) : (AdNetwork) o7Var.l(i, false);
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public int getAdNetworksCount() {
            o7 o7Var = this.adNetworksBuilder_;
            return o7Var == null ? this.adNetworks_.size() : o7Var.b.size();
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public List<AdNetwork> getAdNetworksList() {
            o7 o7Var = this.adNetworksBuilder_;
            return o7Var == null ? Collections.unmodifiableList(this.adNetworks_) : o7Var.m();
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public int getAdNetworksLoadingTimeout() {
            return this.adNetworksLoadingTimeout_;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public AdNetworkOrBuilder getAdNetworksOrBuilder(int i) {
            o7 o7Var = this.adNetworksBuilder_;
            return o7Var == null ? this.adNetworks_.get(i) : (AdNetworkOrBuilder) o7Var.n(i);
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public List<? extends AdNetworkOrBuilder> getAdNetworksOrBuilderList() {
            o7 o7Var = this.adNetworksBuilder_;
            return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.adNetworks_);
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public int getAdRequestTmax() {
            return this.adRequestTmax_;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public AssetCache.Configuration getAssetCacheConfiguration() {
            v7 v7Var = this.assetCacheConfigurationBuilder_;
            if (v7Var != null) {
                return (AssetCache.Configuration) v7Var.d();
            }
            AssetCache.Configuration configuration = this.assetCacheConfiguration_;
            return configuration == null ? AssetCache.Configuration.getDefaultInstance() : configuration;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public AssetCache.ConfigurationOrBuilder getAssetCacheConfigurationOrBuilder() {
            v7 v7Var = this.assetCacheConfigurationBuilder_;
            if (v7Var != null) {
                return (AssetCache.ConfigurationOrBuilder) v7Var.e();
            }
            AssetCache.Configuration configuration = this.assetCacheConfiguration_;
            return configuration == null ? AssetCache.Configuration.getDefaultInstance() : configuration;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public int getBmifvTtlSessions() {
            return this.bmifvTtlSessions_;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public SdkCrashSignalConfig getCrashSignalConfig() {
            v7 v7Var = this.crashSignalConfigBuilder_;
            if (v7Var != null) {
                return (SdkCrashSignalConfig) v7Var.d();
            }
            SdkCrashSignalConfig sdkCrashSignalConfig = this.crashSignalConfig_;
            return sdkCrashSignalConfig == null ? SdkCrashSignalConfig.getDefaultInstance() : sdkCrashSignalConfig;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public SdkCrashSignalConfigOrBuilder getCrashSignalConfigOrBuilder() {
            v7 v7Var = this.crashSignalConfigBuilder_;
            if (v7Var != null) {
                return (SdkCrashSignalConfigOrBuilder) v7Var.e();
            }
            SdkCrashSignalConfig sdkCrashSignalConfig = this.crashSignalConfig_;
            return sdkCrashSignalConfig == null ? SdkCrashSignalConfig.getDefaultInstance() : sdkCrashSignalConfig;
        }

        @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_InitResponse_descriptor;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public String getEndpoint() {
            Object obj = this.endpoint_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.endpoint_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public ByteString getEndpointBytes() {
            Object obj = this.endpoint_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.endpoint_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public Ad.Event getEvent(int i) {
            o7 o7Var = this.eventBuilder_;
            return o7Var == null ? this.event_.get(i) : (Ad.Event) o7Var.l(i, false);
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public AdExtension.EventConfiguration getEventConfiguration() {
            v7 v7Var = this.eventConfigurationBuilder_;
            if (v7Var != null) {
                return (AdExtension.EventConfiguration) v7Var.d();
            }
            AdExtension.EventConfiguration eventConfiguration = this.eventConfiguration_;
            return eventConfiguration == null ? AdExtension.EventConfiguration.getDefaultInstance() : eventConfiguration;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public AdExtension.EventConfigurationOrBuilder getEventConfigurationOrBuilder() {
            v7 v7Var = this.eventConfigurationBuilder_;
            if (v7Var != null) {
                return (AdExtension.EventConfigurationOrBuilder) v7Var.e();
            }
            AdExtension.EventConfiguration eventConfiguration = this.eventConfiguration_;
            return eventConfiguration == null ? AdExtension.EventConfiguration.getDefaultInstance() : eventConfiguration;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public int getEventCount() {
            o7 o7Var = this.eventBuilder_;
            return o7Var == null ? this.event_.size() : o7Var.b.size();
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public List<Ad.Event> getEventList() {
            o7 o7Var = this.eventBuilder_;
            return o7Var == null ? Collections.unmodifiableList(this.event_) : o7Var.m();
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public Ad.EventOrBuilder getEventOrBuilder(int i) {
            o7 o7Var = this.eventBuilder_;
            return o7Var == null ? this.event_.get(i) : (Ad.EventOrBuilder) o7Var.n(i);
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public List<? extends Ad.EventOrBuilder> getEventOrBuilderList() {
            o7 o7Var = this.eventBuilder_;
            return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.event_);
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public Extras getExtras() {
            v7 v7Var = this.extrasBuilder_;
            if (v7Var != null) {
                return (Extras) v7Var.d();
            }
            Extras extras = this.extras_;
            return extras == null ? Extras.getDefaultInstance() : extras;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public ExtrasOrBuilder getExtrasOrBuilder() {
            v7 v7Var = this.extrasBuilder_;
            if (v7Var != null) {
                return (ExtrasOrBuilder) v7Var.e();
            }
            Extras extras = this.extras_;
            return extras == null ? Extras.getDefaultInstance() : extras;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public RestrictionMode getRestrictionMode() {
            RestrictionMode restrictionModeValueOf = RestrictionMode.valueOf(this.restrictionMode_);
            return restrictionModeValueOf == null ? RestrictionMode.UNRECOGNIZED : restrictionModeValueOf;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public int getRestrictionModeValue() {
            return this.restrictionMode_;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public SdkAnalyticConfig getSdkAnalyticConfig() {
            v7 v7Var = this.sdkAnalyticConfigBuilder_;
            if (v7Var != null) {
                return (SdkAnalyticConfig) v7Var.d();
            }
            SdkAnalyticConfig sdkAnalyticConfig = this.sdkAnalyticConfig_;
            return sdkAnalyticConfig == null ? SdkAnalyticConfig.getDefaultInstance() : sdkAnalyticConfig;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public SdkAnalyticConfigOrBuilder getSdkAnalyticConfigOrBuilder() {
            v7 v7Var = this.sdkAnalyticConfigBuilder_;
            if (v7Var != null) {
                return (SdkAnalyticConfigOrBuilder) v7Var.e();
            }
            SdkAnalyticConfig sdkAnalyticConfig = this.sdkAnalyticConfig_;
            return sdkAnalyticConfig == null ? SdkAnalyticConfig.getDefaultInstance() : sdkAnalyticConfig;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public Configuration getSdkAnalyticConfigV2() {
            v7 v7Var = this.sdkAnalyticConfigV2Builder_;
            if (v7Var != null) {
                return (Configuration) v7Var.d();
            }
            Configuration configuration = this.sdkAnalyticConfigV2_;
            return configuration == null ? Configuration.getDefaultInstance() : configuration;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public ConfigurationOrBuilder getSdkAnalyticConfigV2OrBuilder() {
            v7 v7Var = this.sdkAnalyticConfigV2Builder_;
            if (v7Var != null) {
                return (ConfigurationOrBuilder) v7Var.e();
            }
            Configuration configuration = this.sdkAnalyticConfigV2_;
            return configuration == null ? Configuration.getDefaultInstance() : configuration;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public int getSessionResetAfter() {
            return this.sessionResetAfter_;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public boolean getShowWithoutInternet() {
            return this.showWithoutInternet_;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public TokenConfiguration getTokenConfigurations(int i) {
            o7 o7Var = this.tokenConfigurationsBuilder_;
            return o7Var == null ? this.tokenConfigurations_.get(i) : (TokenConfiguration) o7Var.l(i, false);
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public int getTokenConfigurationsCount() {
            o7 o7Var = this.tokenConfigurationsBuilder_;
            return o7Var == null ? this.tokenConfigurations_.size() : o7Var.b.size();
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public List<TokenConfiguration> getTokenConfigurationsList() {
            o7 o7Var = this.tokenConfigurationsBuilder_;
            return o7Var == null ? Collections.unmodifiableList(this.tokenConfigurations_) : o7Var.m();
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public TokenConfigurationOrBuilder getTokenConfigurationsOrBuilder(int i) {
            o7 o7Var = this.tokenConfigurationsBuilder_;
            return o7Var == null ? this.tokenConfigurations_.get(i) : (TokenConfigurationOrBuilder) o7Var.n(i);
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public List<? extends TokenConfigurationOrBuilder> getTokenConfigurationsOrBuilderList() {
            o7 o7Var = this.tokenConfigurationsBuilder_;
            return o7Var != null ? o7Var.o() : Collections.unmodifiableList(this.tokenConfigurations_);
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public boolean hasAssetCacheConfiguration() {
            return (this.assetCacheConfigurationBuilder_ == null && this.assetCacheConfiguration_ == null) ? false : true;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public boolean hasCrashSignalConfig() {
            return (this.crashSignalConfigBuilder_ == null && this.crashSignalConfig_ == null) ? false : true;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public boolean hasEventConfiguration() {
            return (this.eventConfigurationBuilder_ == null && this.eventConfiguration_ == null) ? false : true;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public boolean hasExtras() {
            return (this.extrasBuilder_ == null && this.extras_ == null) ? false : true;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public boolean hasSdkAnalyticConfig() {
            return (this.sdkAnalyticConfigBuilder_ == null && this.sdkAnalyticConfig_ == null) ? false : true;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public boolean hasSdkAnalyticConfigV2() {
            return (this.sdkAnalyticConfigV2Builder_ == null && this.sdkAnalyticConfigV2_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.g4
        public w4 internalGetFieldAccessorTable() {
            w4 w4Var = InitProto.internal_static_bidmachine_protobuf_InitResponse_fieldAccessorTable;
            w4Var.c(InitResponse.class, Builder.class);
            return w4Var;
        }

        @Override // com.explorestack.protobuf.g4
        public k6 internalGetMapField(int i) {
            if (i == 8) {
                return internalGetAdCachePlacementControl();
            }
            y.j(pv1.k(i, "Invalid map field number: "));
            return null;
        }

        @Override // com.explorestack.protobuf.g4
        public k6 internalGetMutableMapField(int i) {
            if (i == 8) {
                return internalGetMutableAdCachePlacementControl();
            }
            y.j(pv1.k(i, "Invalid map field number: "));
            return null;
        }

        public Builder mergeAssetCacheConfiguration(AssetCache.Configuration configuration) {
            v7 v7Var = this.assetCacheConfigurationBuilder_;
            if (v7Var != null) {
                v7Var.f(configuration);
                return this;
            }
            AssetCache.Configuration configuration2 = this.assetCacheConfiguration_;
            if (configuration2 != null) {
                this.assetCacheConfiguration_ = AssetCache.Configuration.newBuilder(configuration2).mergeFrom(configuration).buildPartial();
            } else {
                this.assetCacheConfiguration_ = configuration;
            }
            onChanged();
            return this;
        }

        public Builder mergeCrashSignalConfig(SdkCrashSignalConfig sdkCrashSignalConfig) {
            v7 v7Var = this.crashSignalConfigBuilder_;
            if (v7Var != null) {
                v7Var.f(sdkCrashSignalConfig);
                return this;
            }
            SdkCrashSignalConfig sdkCrashSignalConfig2 = this.crashSignalConfig_;
            if (sdkCrashSignalConfig2 != null) {
                this.crashSignalConfig_ = SdkCrashSignalConfig.newBuilder(sdkCrashSignalConfig2).mergeFrom(sdkCrashSignalConfig).buildPartial();
            } else {
                this.crashSignalConfig_ = sdkCrashSignalConfig;
            }
            onChanged();
            return this;
        }

        public Builder mergeEventConfiguration(AdExtension.EventConfiguration eventConfiguration) {
            v7 v7Var = this.eventConfigurationBuilder_;
            if (v7Var != null) {
                v7Var.f(eventConfiguration);
                return this;
            }
            AdExtension.EventConfiguration eventConfiguration2 = this.eventConfiguration_;
            if (eventConfiguration2 != null) {
                this.eventConfiguration_ = AdExtension.EventConfiguration.newBuilder(eventConfiguration2).mergeFrom(eventConfiguration).buildPartial();
            } else {
                this.eventConfiguration_ = eventConfiguration;
            }
            onChanged();
            return this;
        }

        public Builder mergeExtras(Extras extras) {
            v7 v7Var = this.extrasBuilder_;
            if (v7Var != null) {
                v7Var.f(extras);
                return this;
            }
            Extras extras2 = this.extras_;
            if (extras2 != null) {
                this.extras_ = Extras.newBuilder(extras2).mergeFrom(extras).buildPartial();
            } else {
                this.extras_ = extras;
            }
            onChanged();
            return this;
        }

        public Builder mergeSdkAnalyticConfig(SdkAnalyticConfig sdkAnalyticConfig) {
            v7 v7Var = this.sdkAnalyticConfigBuilder_;
            if (v7Var != null) {
                v7Var.f(sdkAnalyticConfig);
                return this;
            }
            SdkAnalyticConfig sdkAnalyticConfig2 = this.sdkAnalyticConfig_;
            if (sdkAnalyticConfig2 != null) {
                this.sdkAnalyticConfig_ = SdkAnalyticConfig.newBuilder(sdkAnalyticConfig2).mergeFrom(sdkAnalyticConfig).buildPartial();
            } else {
                this.sdkAnalyticConfig_ = sdkAnalyticConfig;
            }
            onChanged();
            return this;
        }

        public Builder mergeSdkAnalyticConfigV2(Configuration configuration) {
            v7 v7Var = this.sdkAnalyticConfigV2Builder_;
            if (v7Var != null) {
                v7Var.f(configuration);
                return this;
            }
            Configuration configuration2 = this.sdkAnalyticConfigV2_;
            if (configuration2 != null) {
                this.sdkAnalyticConfigV2_ = Configuration.newBuilder(configuration2).mergeFrom(configuration).buildPartial();
            } else {
                this.sdkAnalyticConfigV2_ = configuration;
            }
            onChanged();
            return this;
        }

        public Builder removeAdNetworks(int i) {
            o7 o7Var = this.adNetworksBuilder_;
            if (o7Var != null) {
                o7Var.r(i);
                return this;
            }
            ensureAdNetworksIsMutable();
            this.adNetworks_.remove(i);
            onChanged();
            return this;
        }

        public Builder removeEvent(int i) {
            o7 o7Var = this.eventBuilder_;
            if (o7Var != null) {
                o7Var.r(i);
                return this;
            }
            ensureEventIsMutable();
            this.event_.remove(i);
            onChanged();
            return this;
        }

        public Builder removeTokenConfigurations(int i) {
            o7 o7Var = this.tokenConfigurationsBuilder_;
            if (o7Var != null) {
                o7Var.r(i);
                return this;
            }
            ensureTokenConfigurationsIsMutable();
            this.tokenConfigurations_.remove(i);
            onChanged();
            return this;
        }

        public Builder setAdCacheControlValue(int i) {
            this.adCacheControl_ = i;
            onChanged();
            return this;
        }

        public Builder setAdCacheMaxAge(int i) {
            this.adCacheMaxAge_ = i;
            onChanged();
            return this;
        }

        public Builder setAdNetworks(int i, AdNetwork.Builder builder) {
            o7 o7Var = this.adNetworksBuilder_;
            if (o7Var != null) {
                o7Var.s(i, builder.build());
                return this;
            }
            ensureAdNetworksIsMutable();
            this.adNetworks_.set(i, builder.build());
            onChanged();
            return this;
        }

        public Builder setAdNetworksLoadingTimeout(int i) {
            this.adNetworksLoadingTimeout_ = i;
            onChanged();
            return this;
        }

        public Builder setAdRequestTmax(int i) {
            this.adRequestTmax_ = i;
            onChanged();
            return this;
        }

        public Builder setAssetCacheConfiguration(AssetCache.Configuration.Builder builder) {
            v7 v7Var = this.assetCacheConfigurationBuilder_;
            if (v7Var != null) {
                v7Var.h(builder.build());
                return this;
            }
            this.assetCacheConfiguration_ = builder.build();
            onChanged();
            return this;
        }

        public Builder setBmifvTtlSessions(int i) {
            this.bmifvTtlSessions_ = i;
            onChanged();
            return this;
        }

        public Builder setCrashSignalConfig(SdkCrashSignalConfig.Builder builder) {
            v7 v7Var = this.crashSignalConfigBuilder_;
            if (v7Var != null) {
                v7Var.h(builder.build());
                return this;
            }
            this.crashSignalConfig_ = builder.build();
            onChanged();
            return this;
        }

        public Builder setEvent(int i, Ad.Event.Builder builder) {
            o7 o7Var = this.eventBuilder_;
            if (o7Var != null) {
                o7Var.s(i, builder.build());
                return this;
            }
            ensureEventIsMutable();
            this.event_.set(i, builder.build());
            onChanged();
            return this;
        }

        public Builder setEventConfiguration(AdExtension.EventConfiguration.Builder builder) {
            v7 v7Var = this.eventConfigurationBuilder_;
            if (v7Var != null) {
                v7Var.h(builder.build());
                return this;
            }
            this.eventConfiguration_ = builder.build();
            onChanged();
            return this;
        }

        public Builder setExtras(Extras.Builder builder) {
            v7 v7Var = this.extrasBuilder_;
            if (v7Var != null) {
                v7Var.h(builder.build());
                return this;
            }
            this.extras_ = builder.build();
            onChanged();
            return this;
        }

        public Builder setRestrictionModeValue(int i) {
            this.restrictionMode_ = i;
            onChanged();
            return this;
        }

        public Builder setSdkAnalyticConfig(SdkAnalyticConfig.Builder builder) {
            v7 v7Var = this.sdkAnalyticConfigBuilder_;
            if (v7Var != null) {
                v7Var.h(builder.build());
                return this;
            }
            this.sdkAnalyticConfig_ = builder.build();
            onChanged();
            return this;
        }

        public Builder setSdkAnalyticConfigV2(Configuration.Builder builder) {
            v7 v7Var = this.sdkAnalyticConfigV2Builder_;
            if (v7Var != null) {
                v7Var.h(builder.build());
                return this;
            }
            this.sdkAnalyticConfigV2_ = builder.build();
            onChanged();
            return this;
        }

        public Builder setSessionResetAfter(int i) {
            this.sessionResetAfter_ = i;
            onChanged();
            return this;
        }

        public Builder setShowWithoutInternet(boolean z) {
            this.showWithoutInternet_ = z;
            onChanged();
            return this;
        }

        public Builder setTokenConfigurations(int i, TokenConfiguration.Builder builder) {
            o7 o7Var = this.tokenConfigurationsBuilder_;
            if (o7Var != null) {
                o7Var.s(i, builder.build());
                return this;
            }
            ensureTokenConfigurationsIsMutable();
            this.tokenConfigurations_.set(i, builder.build());
            onChanged();
            return this;
        }

        private k6 internalGetMutableAdCachePlacementControl() {
            onChanged();
            if (this.adCachePlacementControl_ == null) {
                this.adCachePlacementControl_ = k6.l(AdCachePlacementControlDefaultEntryHolder.defaultEntry);
            }
            if (!this.adCachePlacementControl_.a) {
                this.adCachePlacementControl_ = this.adCachePlacementControl_.d();
            }
            return this.adCachePlacementControl_;
        }

        private void maybeForceBuilderInitialization() {
            if (y4.alwaysUseFieldBuilders) {
                getEventFieldBuilder();
                getAdNetworksFieldBuilder();
                getTokenConfigurationsFieldBuilder();
            }
        }

        public AdNetwork.Builder addAdNetworksBuilder() {
            return (AdNetwork.Builder) getAdNetworksFieldBuilder().c(AdNetwork.getDefaultInstance());
        }

        public Ad.Event.Builder addEventBuilder() {
            return (Ad.Event.Builder) getEventFieldBuilder().c(Ad.Event.getDefaultInstance());
        }

        public TokenConfiguration.Builder addTokenConfigurationsBuilder() {
            return (TokenConfiguration.Builder) getTokenConfigurationsFieldBuilder().c(TokenConfiguration.getDefaultInstance());
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public InitResponse build() {
            InitResponse initResponseBuildPartial = buildPartial();
            if (initResponseBuildPartial.isInitialized()) {
                return initResponseBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) initResponseBuildPartial);
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.endpoint_ = "";
            o7 o7Var = this.eventBuilder_;
            if (o7Var == null) {
                this.event_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
            } else {
                o7Var.g();
            }
            this.sessionResetAfter_ = 0;
            o7 o7Var2 = this.adNetworksBuilder_;
            if (o7Var2 == null) {
                this.adNetworks_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
            } else {
                o7Var2.g();
            }
            this.adCacheControl_ = 0;
            this.adCacheMaxAge_ = 0;
            this.adRequestTmax_ = 0;
            internalGetMutableAdCachePlacementControl().a();
            this.adNetworksLoadingTimeout_ = 0;
            if (this.sdkAnalyticConfigBuilder_ == null) {
                this.sdkAnalyticConfig_ = null;
            } else {
                this.sdkAnalyticConfig_ = null;
                this.sdkAnalyticConfigBuilder_ = null;
            }
            if (this.eventConfigurationBuilder_ == null) {
                this.eventConfiguration_ = null;
            } else {
                this.eventConfiguration_ = null;
                this.eventConfigurationBuilder_ = null;
            }
            o7 o7Var3 = this.tokenConfigurationsBuilder_;
            if (o7Var3 == null) {
                this.tokenConfigurations_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
            } else {
                o7Var3.g();
            }
            this.showWithoutInternet_ = false;
            if (this.extrasBuilder_ == null) {
                this.extras_ = null;
            } else {
                this.extras_ = null;
                this.extrasBuilder_ = null;
            }
            if (this.sdkAnalyticConfigV2Builder_ == null) {
                this.sdkAnalyticConfigV2_ = null;
            } else {
                this.sdkAnalyticConfigV2_ = null;
                this.sdkAnalyticConfigV2Builder_ = null;
            }
            if (this.assetCacheConfigurationBuilder_ == null) {
                this.assetCacheConfiguration_ = null;
            } else {
                this.assetCacheConfiguration_ = null;
                this.assetCacheConfigurationBuilder_ = null;
            }
            this.restrictionMode_ = 0;
            this.bmifvTtlSessions_ = 0;
            if (this.crashSignalConfigBuilder_ == null) {
                this.crashSignalConfig_ = null;
                return this;
            }
            this.crashSignalConfig_ = null;
            this.crashSignalConfigBuilder_ = null;
            return this;
        }

        public Builder clearAdCachePlacementControl() {
            internalGetMutableAdCachePlacementControl().j().clear();
            return this;
        }

        public Builder clearEndpoint() {
            this.endpoint_ = InitResponse.getDefaultInstance().getEndpoint();
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo247clone() {
            return (Builder) super.mo247clone();
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public boolean containsAdCachePlacementControl(String str) {
            str.getClass();
            return internalGetAdCachePlacementControl().h().containsKey(str);
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        @Deprecated
        public Map<String, AdCachePlacementControl> getAdCachePlacementControl() {
            return getAdCachePlacementControlMap();
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public int getAdCachePlacementControlCount() {
            return internalGetAdCachePlacementControl().h().size();
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public Map<String, AdCachePlacementControl> getAdCachePlacementControlMap() {
            return internalGetAdCachePlacementControl().h();
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public AdCachePlacementControl getAdCachePlacementControlOrDefault(String str, AdCachePlacementControl adCachePlacementControl) {
            str.getClass();
            Map mapH = internalGetAdCachePlacementControl().h();
            if (mapH.containsKey(str)) {
                return (AdCachePlacementControl) mapH.get(str);
            }
            return adCachePlacementControl;
        }

        @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
        public AdCachePlacementControl getAdCachePlacementControlOrThrow(String str) {
            str.getClass();
            Map mapH = internalGetAdCachePlacementControl().h();
            if (mapH.containsKey(str)) {
                return (AdCachePlacementControl) mapH.get(str);
            }
            e32.a();
            return null;
        }

        public AdNetwork.Builder getAdNetworksBuilder(int i) {
            return (AdNetwork.Builder) getAdNetworksFieldBuilder().j(i);
        }

        public List<AdNetwork.Builder> getAdNetworksBuilderList() {
            return getAdNetworksFieldBuilder().k();
        }

        public AssetCache.Configuration.Builder getAssetCacheConfigurationBuilder() {
            onChanged();
            return (AssetCache.Configuration.Builder) getAssetCacheConfigurationFieldBuilder().c();
        }

        public SdkCrashSignalConfig.Builder getCrashSignalConfigBuilder() {
            onChanged();
            return (SdkCrashSignalConfig.Builder) getCrashSignalConfigFieldBuilder().c();
        }

        public Ad.Event.Builder getEventBuilder(int i) {
            return (Ad.Event.Builder) getEventFieldBuilder().j(i);
        }

        public List<Ad.Event.Builder> getEventBuilderList() {
            return getEventFieldBuilder().k();
        }

        public AdExtension.EventConfiguration.Builder getEventConfigurationBuilder() {
            onChanged();
            return (AdExtension.EventConfiguration.Builder) getEventConfigurationFieldBuilder().c();
        }

        public Extras.Builder getExtrasBuilder() {
            onChanged();
            return (Extras.Builder) getExtrasFieldBuilder().c();
        }

        @Deprecated
        public Map<String, AdCachePlacementControl> getMutableAdCachePlacementControl() {
            return internalGetMutableAdCachePlacementControl().j();
        }

        public SdkAnalyticConfig.Builder getSdkAnalyticConfigBuilder() {
            onChanged();
            return (SdkAnalyticConfig.Builder) getSdkAnalyticConfigFieldBuilder().c();
        }

        public Configuration.Builder getSdkAnalyticConfigV2Builder() {
            onChanged();
            return (Configuration.Builder) getSdkAnalyticConfigV2FieldBuilder().c();
        }

        public TokenConfiguration.Builder getTokenConfigurationsBuilder(int i) {
            return (TokenConfiguration.Builder) getTokenConfigurationsFieldBuilder().j(i);
        }

        public List<TokenConfiguration.Builder> getTokenConfigurationsBuilderList() {
            return getTokenConfigurationsFieldBuilder().k();
        }

        public Builder mergeFrom(InitResponse initResponse) {
            o7 eventFieldBuilder;
            o7 adNetworksFieldBuilder;
            if (initResponse == InitResponse.getDefaultInstance()) {
                return this;
            }
            if (!initResponse.getEndpoint().isEmpty()) {
                this.endpoint_ = initResponse.endpoint_;
                onChanged();
            }
            o7 tokenConfigurationsFieldBuilder = null;
            if (this.eventBuilder_ == null) {
                if (!initResponse.event_.isEmpty()) {
                    if (this.event_.isEmpty()) {
                        this.event_ = initResponse.event_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureEventIsMutable();
                        this.event_.addAll(initResponse.event_);
                    }
                    onChanged();
                }
            } else if (!initResponse.event_.isEmpty()) {
                boolean zIsEmpty = this.eventBuilder_.b.isEmpty();
                o7 o7Var = this.eventBuilder_;
                if (zIsEmpty) {
                    o7Var.a = null;
                    this.eventBuilder_ = null;
                    this.event_ = initResponse.event_;
                    this.bitField0_ &= -2;
                    if (y4.alwaysUseFieldBuilders) {
                        eventFieldBuilder = getEventFieldBuilder();
                    } else {
                        eventFieldBuilder = null;
                    }
                    this.eventBuilder_ = eventFieldBuilder;
                } else {
                    o7Var.a(initResponse.event_);
                }
            }
            if (initResponse.getSessionResetAfter() != 0) {
                setSessionResetAfter(initResponse.getSessionResetAfter());
            }
            if (this.adNetworksBuilder_ == null) {
                if (!initResponse.adNetworks_.isEmpty()) {
                    if (this.adNetworks_.isEmpty()) {
                        this.adNetworks_ = initResponse.adNetworks_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureAdNetworksIsMutable();
                        this.adNetworks_.addAll(initResponse.adNetworks_);
                    }
                    onChanged();
                }
            } else if (!initResponse.adNetworks_.isEmpty()) {
                boolean zIsEmpty2 = this.adNetworksBuilder_.b.isEmpty();
                o7 o7Var2 = this.adNetworksBuilder_;
                if (zIsEmpty2) {
                    o7Var2.a = null;
                    this.adNetworksBuilder_ = null;
                    this.adNetworks_ = initResponse.adNetworks_;
                    this.bitField0_ &= -3;
                    if (y4.alwaysUseFieldBuilders) {
                        adNetworksFieldBuilder = getAdNetworksFieldBuilder();
                    } else {
                        adNetworksFieldBuilder = null;
                    }
                    this.adNetworksBuilder_ = adNetworksFieldBuilder;
                } else {
                    o7Var2.a(initResponse.adNetworks_);
                }
            }
            if (initResponse.adCacheControl_ != 0) {
                setAdCacheControlValue(initResponse.getAdCacheControlValue());
            }
            if (initResponse.getAdCacheMaxAge() != 0) {
                setAdCacheMaxAge(initResponse.getAdCacheMaxAge());
            }
            if (initResponse.getAdRequestTmax() != 0) {
                setAdRequestTmax(initResponse.getAdRequestTmax());
            }
            internalGetMutableAdCachePlacementControl().k(initResponse.internalGetAdCachePlacementControl());
            if (initResponse.getAdNetworksLoadingTimeout() != 0) {
                setAdNetworksLoadingTimeout(initResponse.getAdNetworksLoadingTimeout());
            }
            if (initResponse.hasSdkAnalyticConfig()) {
                mergeSdkAnalyticConfig(initResponse.getSdkAnalyticConfig());
            }
            if (initResponse.hasEventConfiguration()) {
                mergeEventConfiguration(initResponse.getEventConfiguration());
            }
            if (this.tokenConfigurationsBuilder_ == null) {
                if (!initResponse.tokenConfigurations_.isEmpty()) {
                    if (this.tokenConfigurations_.isEmpty()) {
                        this.tokenConfigurations_ = initResponse.tokenConfigurations_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureTokenConfigurationsIsMutable();
                        this.tokenConfigurations_.addAll(initResponse.tokenConfigurations_);
                    }
                    onChanged();
                }
            } else if (!initResponse.tokenConfigurations_.isEmpty()) {
                boolean zIsEmpty3 = this.tokenConfigurationsBuilder_.b.isEmpty();
                o7 o7Var3 = this.tokenConfigurationsBuilder_;
                if (zIsEmpty3) {
                    o7Var3.a = null;
                    this.tokenConfigurationsBuilder_ = null;
                    this.tokenConfigurations_ = initResponse.tokenConfigurations_;
                    this.bitField0_ &= -9;
                    if (y4.alwaysUseFieldBuilders) {
                        tokenConfigurationsFieldBuilder = getTokenConfigurationsFieldBuilder();
                    }
                    this.tokenConfigurationsBuilder_ = tokenConfigurationsFieldBuilder;
                } else {
                    o7Var3.a(initResponse.tokenConfigurations_);
                }
            }
            if (initResponse.getShowWithoutInternet()) {
                setShowWithoutInternet(initResponse.getShowWithoutInternet());
            }
            if (initResponse.hasExtras()) {
                mergeExtras(initResponse.getExtras());
            }
            if (initResponse.hasSdkAnalyticConfigV2()) {
                mergeSdkAnalyticConfigV2(initResponse.getSdkAnalyticConfigV2());
            }
            if (initResponse.hasAssetCacheConfiguration()) {
                mergeAssetCacheConfiguration(initResponse.getAssetCacheConfiguration());
            }
            if (initResponse.restrictionMode_ != 0) {
                setRestrictionModeValue(initResponse.getRestrictionModeValue());
            }
            if (initResponse.getBmifvTtlSessions() != 0) {
                setBmifvTtlSessions(initResponse.getBmifvTtlSessions());
            }
            if (initResponse.hasCrashSignalConfig()) {
                mergeCrashSignalConfig(initResponse.getCrashSignalConfig());
            }
            mergeUnknownFields(((y4) initResponse).unknownFields);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(s8 s8Var) {
            return (Builder) super.mergeUnknownFields(s8Var);
        }

        public Builder putAdCachePlacementControl(String str, AdCachePlacementControl adCachePlacementControl) {
            str.getClass();
            adCachePlacementControl.getClass();
            internalGetMutableAdCachePlacementControl().j().put(str, adCachePlacementControl);
            return this;
        }

        public Builder putAllAdCachePlacementControl(Map<String, AdCachePlacementControl> map) {
            internalGetMutableAdCachePlacementControl().j().putAll(map);
            return this;
        }

        public Builder removeAdCachePlacementControl(String str) {
            str.getClass();
            internalGetMutableAdCachePlacementControl().j().remove(str);
            return this;
        }

        public Builder setAdCacheControl(AdCacheControl adCacheControl) {
            adCacheControl.getClass();
            this.adCacheControl_ = adCacheControl.getNumber();
            onChanged();
            return this;
        }

        public Builder setEndpoint(String str) {
            str.getClass();
            this.endpoint_ = str;
            onChanged();
            return this;
        }

        public Builder setEndpointBytes(ByteString byteString) {
            byteString.getClass();
            c.checkByteStringIsUtf8(byteString);
            this.endpoint_ = byteString;
            onChanged();
            return this;
        }

        public Builder setRestrictionMode(RestrictionMode restrictionMode) {
            restrictionMode.getClass();
            this.restrictionMode_ = restrictionMode.getNumber();
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            super.addRepeatedField(fieldDescriptor, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            super.clearField(fieldDescriptor);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public InitResponse mo250getDefaultInstanceForType() {
            return InitResponse.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            super.setField(fieldDescriptor, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            super.setRepeatedField(fieldDescriptor, i, obj);
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(s8 s8Var) {
            super.setUnknownFields(s8Var);
            return this;
        }

        @Override // com.explorestack.protobuf.g4, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            super.clearOneof(oneofDescriptor);
            return this;
        }

        public AdNetwork.Builder addAdNetworksBuilder(int i) {
            return (AdNetwork.Builder) getAdNetworksFieldBuilder().b(i, AdNetwork.getDefaultInstance());
        }

        public Ad.Event.Builder addEventBuilder(int i) {
            return (Ad.Event.Builder) getEventFieldBuilder().b(i, Ad.Event.getDefaultInstance());
        }

        public TokenConfiguration.Builder addTokenConfigurationsBuilder(int i) {
            return (TokenConfiguration.Builder) getTokenConfigurationsFieldBuilder().b(i, TokenConfiguration.getDefaultInstance());
        }

        public Builder setAssetCacheConfiguration(AssetCache.Configuration configuration) {
            v7 v7Var = this.assetCacheConfigurationBuilder_;
            if (v7Var == null) {
                configuration.getClass();
                this.assetCacheConfiguration_ = configuration;
                onChanged();
                return this;
            }
            v7Var.h(configuration);
            return this;
        }

        public Builder setCrashSignalConfig(SdkCrashSignalConfig sdkCrashSignalConfig) {
            v7 v7Var = this.crashSignalConfigBuilder_;
            if (v7Var == null) {
                sdkCrashSignalConfig.getClass();
                this.crashSignalConfig_ = sdkCrashSignalConfig;
                onChanged();
                return this;
            }
            v7Var.h(sdkCrashSignalConfig);
            return this;
        }

        public Builder setEventConfiguration(AdExtension.EventConfiguration eventConfiguration) {
            v7 v7Var = this.eventConfigurationBuilder_;
            if (v7Var == null) {
                eventConfiguration.getClass();
                this.eventConfiguration_ = eventConfiguration;
                onChanged();
                return this;
            }
            v7Var.h(eventConfiguration);
            return this;
        }

        public Builder setExtras(Extras extras) {
            v7 v7Var = this.extrasBuilder_;
            if (v7Var == null) {
                extras.getClass();
                this.extras_ = extras;
                onChanged();
                return this;
            }
            v7Var.h(extras);
            return this;
        }

        public Builder setSdkAnalyticConfig(SdkAnalyticConfig sdkAnalyticConfig) {
            v7 v7Var = this.sdkAnalyticConfigBuilder_;
            if (v7Var == null) {
                sdkAnalyticConfig.getClass();
                this.sdkAnalyticConfig_ = sdkAnalyticConfig;
                onChanged();
                return this;
            }
            v7Var.h(sdkAnalyticConfig);
            return this;
        }

        public Builder setSdkAnalyticConfigV2(Configuration configuration) {
            v7 v7Var = this.sdkAnalyticConfigV2Builder_;
            if (v7Var == null) {
                configuration.getClass();
                this.sdkAnalyticConfigV2_ = configuration;
                onChanged();
                return this;
            }
            v7Var.h(configuration);
            return this;
        }

        private Builder(h4 h4Var) {
            super(h4Var);
            this.endpoint_ = "";
            List list = Collections.EMPTY_LIST;
            this.event_ = list;
            this.adNetworks_ = list;
            this.adCacheControl_ = 0;
            this.tokenConfigurations_ = list;
            this.restrictionMode_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder addAdNetworks(int i, AdNetwork adNetwork) {
            o7 o7Var = this.adNetworksBuilder_;
            if (o7Var == null) {
                adNetwork.getClass();
                ensureAdNetworksIsMutable();
                this.adNetworks_.add(i, adNetwork);
                onChanged();
                return this;
            }
            o7Var.d(i, adNetwork);
            return this;
        }

        public Builder addEvent(int i, Ad.Event event) {
            o7 o7Var = this.eventBuilder_;
            if (o7Var == null) {
                event.getClass();
                ensureEventIsMutable();
                this.event_.add(i, event);
                onChanged();
                return this;
            }
            o7Var.d(i, event);
            return this;
        }

        public Builder addTokenConfigurations(int i, TokenConfiguration tokenConfiguration) {
            o7 o7Var = this.tokenConfigurationsBuilder_;
            if (o7Var == null) {
                tokenConfiguration.getClass();
                ensureTokenConfigurationsIsMutable();
                this.tokenConfigurations_.add(i, tokenConfiguration);
                onChanged();
                return this;
            }
            o7Var.d(i, tokenConfiguration);
            return this;
        }

        public Builder setAdNetworks(int i, AdNetwork adNetwork) {
            o7 o7Var = this.adNetworksBuilder_;
            if (o7Var == null) {
                adNetwork.getClass();
                ensureAdNetworksIsMutable();
                this.adNetworks_.set(i, adNetwork);
                onChanged();
                return this;
            }
            o7Var.s(i, adNetwork);
            return this;
        }

        public Builder setEvent(int i, Ad.Event event) {
            o7 o7Var = this.eventBuilder_;
            if (o7Var == null) {
                event.getClass();
                ensureEventIsMutable();
                this.event_.set(i, event);
                onChanged();
                return this;
            }
            o7Var.s(i, event);
            return this;
        }

        public Builder setTokenConfigurations(int i, TokenConfiguration tokenConfiguration) {
            o7 o7Var = this.tokenConfigurationsBuilder_;
            if (o7Var == null) {
                tokenConfiguration.getClass();
                ensureTokenConfigurationsIsMutable();
                this.tokenConfigurations_.set(i, tokenConfiguration);
                onChanged();
                return this;
            }
            o7Var.s(i, tokenConfiguration);
            return this;
        }

        public Builder addAdNetworks(AdNetwork adNetwork) {
            o7 o7Var = this.adNetworksBuilder_;
            if (o7Var == null) {
                adNetwork.getClass();
                ensureAdNetworksIsMutable();
                this.adNetworks_.add(adNetwork);
                onChanged();
                return this;
            }
            o7Var.e(adNetwork);
            return this;
        }

        public Builder addEvent(Ad.Event event) {
            o7 o7Var = this.eventBuilder_;
            if (o7Var == null) {
                event.getClass();
                ensureEventIsMutable();
                this.event_.add(event);
                onChanged();
                return this;
            }
            o7Var.e(event);
            return this;
        }

        public Builder addTokenConfigurations(TokenConfiguration tokenConfiguration) {
            o7 o7Var = this.tokenConfigurationsBuilder_;
            if (o7Var == null) {
                tokenConfiguration.getClass();
                ensureTokenConfigurationsIsMutable();
                this.tokenConfigurations_.add(tokenConfiguration);
                onChanged();
                return this;
            }
            o7Var.e(tokenConfiguration);
            return this;
        }

        public Builder addAdNetworks(int i, AdNetwork.Builder builder) {
            o7 o7Var = this.adNetworksBuilder_;
            if (o7Var == null) {
                ensureAdNetworksIsMutable();
                this.adNetworks_.add(i, builder.build());
                onChanged();
                return this;
            }
            o7Var.d(i, builder.build());
            return this;
        }

        public Builder addEvent(int i, Ad.Event.Builder builder) {
            o7 o7Var = this.eventBuilder_;
            if (o7Var == null) {
                ensureEventIsMutable();
                this.event_.add(i, builder.build());
                onChanged();
                return this;
            }
            o7Var.d(i, builder.build());
            return this;
        }

        public Builder addTokenConfigurations(int i, TokenConfiguration.Builder builder) {
            o7 o7Var = this.tokenConfigurationsBuilder_;
            if (o7Var == null) {
                ensureTokenConfigurationsIsMutable();
                this.tokenConfigurations_.add(i, builder.build());
                onChanged();
                return this;
            }
            o7Var.d(i, builder.build());
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof InitResponse) {
                return mergeFrom((InitResponse) message);
            }
            super.mergeFrom(message);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(r rVar, o3 o3Var) throws Throwable {
            InitResponse initResponse = null;
            try {
                try {
                    InitResponse initResponse2 = (InitResponse) InitResponse.PARSER.parsePartialFrom(rVar, o3Var);
                    if (initResponse2 != null) {
                        mergeFrom(initResponse2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    InitResponse initResponse3 = (InitResponse) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        initResponse = initResponse3;
                        if (initResponse != null) {
                            mergeFrom(initResponse);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (initResponse != null) {
                    mergeFrom(initResponse);
                }
                throw th;
            }
        }
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitResponse)) {
            return super.equals(obj);
        }
        InitResponse initResponse = (InitResponse) obj;
        if (!getEndpoint().equals(initResponse.getEndpoint()) || !getEventList().equals(initResponse.getEventList()) || getSessionResetAfter() != initResponse.getSessionResetAfter() || !getAdNetworksList().equals(initResponse.getAdNetworksList()) || this.adCacheControl_ != initResponse.adCacheControl_ || getAdCacheMaxAge() != initResponse.getAdCacheMaxAge() || getAdRequestTmax() != initResponse.getAdRequestTmax() || !internalGetAdCachePlacementControl().equals(initResponse.internalGetAdCachePlacementControl()) || getAdNetworksLoadingTimeout() != initResponse.getAdNetworksLoadingTimeout() || hasSdkAnalyticConfig() != initResponse.hasSdkAnalyticConfig()) {
            return false;
        }
        if ((hasSdkAnalyticConfig() && !getSdkAnalyticConfig().equals(initResponse.getSdkAnalyticConfig())) || hasEventConfiguration() != initResponse.hasEventConfiguration()) {
            return false;
        }
        if ((hasEventConfiguration() && !getEventConfiguration().equals(initResponse.getEventConfiguration())) || !getTokenConfigurationsList().equals(initResponse.getTokenConfigurationsList()) || getShowWithoutInternet() != initResponse.getShowWithoutInternet() || hasExtras() != initResponse.hasExtras()) {
            return false;
        }
        if ((hasExtras() && !getExtras().equals(initResponse.getExtras())) || hasSdkAnalyticConfigV2() != initResponse.hasSdkAnalyticConfigV2()) {
            return false;
        }
        if ((hasSdkAnalyticConfigV2() && !getSdkAnalyticConfigV2().equals(initResponse.getSdkAnalyticConfigV2())) || hasAssetCacheConfiguration() != initResponse.hasAssetCacheConfiguration()) {
            return false;
        }
        if ((!hasAssetCacheConfiguration() || getAssetCacheConfiguration().equals(initResponse.getAssetCacheConfiguration())) && this.restrictionMode_ == initResponse.restrictionMode_ && getBmifvTtlSessions() == initResponse.getBmifvTtlSessions() && hasCrashSignalConfig() == initResponse.hasCrashSignalConfig()) {
            return (!hasCrashSignalConfig() || getCrashSignalConfig().equals(initResponse.getCrashSignalConfig())) && this.unknownFields.equals(initResponse.unknownFields);
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class AdCachePlacementControlDefaultEntryHolder {
        static final d6 defaultEntry = new d6(InitProto.internal_static_bidmachine_protobuf_InitResponse_AdCachePlacementControlEntry_descriptor, l9.c, l9.e, AdCachePlacementControl.getDefaultInstance());

        private AdCachePlacementControlDefaultEntryHolder() {
        }
    }

    public static InitResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_InitResponse_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k6 internalGetAdCachePlacementControl() {
        k6 k6Var = this.adCachePlacementControl_;
        return k6Var == null ? k6.e(AdCachePlacementControlDefaultEntryHolder.defaultEntry) : k6Var;
    }

    public static Builder newBuilder(InitResponse initResponse) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(initResponse);
    }

    public static InitResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InitResponse) y4.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static InitResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InitResponse) PARSER.parseFrom(byteBuffer);
    }

    public static g7 parser() {
        return PARSER;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public AdCacheControl getAdCacheControl() {
        AdCacheControl adCacheControlValueOf = AdCacheControl.valueOf(this.adCacheControl_);
        return adCacheControlValueOf == null ? AdCacheControl.UNRECOGNIZED : adCacheControlValueOf;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public int getAdCacheControlValue() {
        return this.adCacheControl_;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public int getAdCacheMaxAge() {
        return this.adCacheMaxAge_;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public AdNetwork getAdNetworks(int i) {
        return this.adNetworks_.get(i);
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public int getAdNetworksCount() {
        return this.adNetworks_.size();
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public List<AdNetwork> getAdNetworksList() {
        return this.adNetworks_;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public int getAdNetworksLoadingTimeout() {
        return this.adNetworksLoadingTimeout_;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public AdNetworkOrBuilder getAdNetworksOrBuilder(int i) {
        return this.adNetworks_.get(i);
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public List<? extends AdNetworkOrBuilder> getAdNetworksOrBuilderList() {
        return this.adNetworks_;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public int getAdRequestTmax() {
        return this.adRequestTmax_;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public AssetCache.Configuration getAssetCacheConfiguration() {
        AssetCache.Configuration configuration = this.assetCacheConfiguration_;
        return configuration == null ? AssetCache.Configuration.getDefaultInstance() : configuration;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public int getBmifvTtlSessions() {
        return this.bmifvTtlSessions_;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public SdkCrashSignalConfig getCrashSignalConfig() {
        SdkCrashSignalConfig sdkCrashSignalConfig = this.crashSignalConfig_;
        return sdkCrashSignalConfig == null ? SdkCrashSignalConfig.getDefaultInstance() : sdkCrashSignalConfig;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public String getEndpoint() {
        Object obj = this.endpoint_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.endpoint_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public ByteString getEndpointBytes() {
        Object obj = this.endpoint_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.endpoint_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public Ad.Event getEvent(int i) {
        return this.event_.get(i);
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public AdExtension.EventConfiguration getEventConfiguration() {
        AdExtension.EventConfiguration eventConfiguration = this.eventConfiguration_;
        return eventConfiguration == null ? AdExtension.EventConfiguration.getDefaultInstance() : eventConfiguration;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public int getEventCount() {
        return this.event_.size();
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public List<Ad.Event> getEventList() {
        return this.event_;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public Ad.EventOrBuilder getEventOrBuilder(int i) {
        return this.event_.get(i);
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public List<? extends Ad.EventOrBuilder> getEventOrBuilderList() {
        return this.event_;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public Extras getExtras() {
        Extras extras = this.extras_;
        return extras == null ? Extras.getDefaultInstance() : extras;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public g7 getParserForType() {
        return PARSER;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public RestrictionMode getRestrictionMode() {
        RestrictionMode restrictionModeValueOf = RestrictionMode.valueOf(this.restrictionMode_);
        return restrictionModeValueOf == null ? RestrictionMode.UNRECOGNIZED : restrictionModeValueOf;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public int getRestrictionModeValue() {
        return this.restrictionMode_;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public SdkAnalyticConfig getSdkAnalyticConfig() {
        SdkAnalyticConfig sdkAnalyticConfig = this.sdkAnalyticConfig_;
        return sdkAnalyticConfig == null ? SdkAnalyticConfig.getDefaultInstance() : sdkAnalyticConfig;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public Configuration getSdkAnalyticConfigV2() {
        Configuration configuration = this.sdkAnalyticConfigV2_;
        return configuration == null ? Configuration.getDefaultInstance() : configuration;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !getEndpointBytes().isEmpty() ? y4.computeStringSize(1, this.endpoint_) : 0;
        for (int i2 = 0; i2 < this.event_.size(); i2++) {
            iComputeStringSize += w.o(2, this.event_.get(i2));
        }
        int i3 = this.sessionResetAfter_;
        if (i3 != 0) {
            iComputeStringSize += w.t(3, i3);
        }
        for (int i4 = 0; i4 < this.adNetworks_.size(); i4++) {
            iComputeStringSize += w.o(4, this.adNetworks_.get(i4));
        }
        if (this.adCacheControl_ != AdCacheControl.AD_CACHE_CONTROL_DISABLED.getNumber()) {
            iComputeStringSize += w.g(5, this.adCacheControl_);
        }
        int i5 = this.adCacheMaxAge_;
        if (i5 != 0) {
            iComputeStringSize += w.t(6, i5);
        }
        int i6 = this.adRequestTmax_;
        if (i6 != 0) {
            iComputeStringSize += w.t(7, i6);
        }
        for (Map.Entry entry : internalGetAdCachePlacementControl().h().entrySet()) {
            a6 a6VarNewBuilderForType = AdCachePlacementControlDefaultEntryHolder.defaultEntry.newBuilderForType();
            a6VarNewBuilderForType.b = entry.getKey();
            a6VarNewBuilderForType.d = true;
            a6VarNewBuilderForType.c = entry.getValue();
            a6VarNewBuilderForType.e = true;
            d6 d6VarBuild = a6VarNewBuilderForType.build();
            int iS = w.s(8);
            int serializedSize = d6VarBuild.getSerializedSize();
            iComputeStringSize += w.u(serializedSize) + serializedSize + iS;
        }
        int i7 = this.adNetworksLoadingTimeout_;
        if (i7 != 0) {
            iComputeStringSize += w.t(9, i7);
        }
        if (this.sdkAnalyticConfig_ != null) {
            iComputeStringSize += w.o(10, getSdkAnalyticConfig());
        }
        if (this.eventConfiguration_ != null) {
            iComputeStringSize += w.o(11, getEventConfiguration());
        }
        for (int i8 = 0; i8 < this.tokenConfigurations_.size(); i8++) {
            iComputeStringSize += w.o(12, this.tokenConfigurations_.get(i8));
        }
        if (this.showWithoutInternet_) {
            iComputeStringSize += w.c(13);
        }
        if (this.extras_ != null) {
            iComputeStringSize += w.o(14, getExtras());
        }
        if (this.sdkAnalyticConfigV2_ != null) {
            iComputeStringSize += w.o(15, getSdkAnalyticConfigV2());
        }
        if (this.assetCacheConfiguration_ != null) {
            iComputeStringSize += w.o(16, getAssetCacheConfiguration());
        }
        if (this.restrictionMode_ != RestrictionMode.RESTRICTION_MODE_STRICT.getNumber()) {
            iComputeStringSize += w.g(17, this.restrictionMode_);
        }
        int i9 = this.bmifvTtlSessions_;
        if (i9 != 0) {
            iComputeStringSize += w.t(18, i9);
        }
        if (this.crashSignalConfig_ != null) {
            iComputeStringSize += w.o(19, getCrashSignalConfig());
        }
        int serializedSize2 = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize2;
        return serializedSize2;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public int getSessionResetAfter() {
        return this.sessionResetAfter_;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public boolean getShowWithoutInternet() {
        return this.showWithoutInternet_;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public TokenConfiguration getTokenConfigurations(int i) {
        return this.tokenConfigurations_.get(i);
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public int getTokenConfigurationsCount() {
        return this.tokenConfigurations_.size();
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public List<TokenConfiguration> getTokenConfigurationsList() {
        return this.tokenConfigurations_;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public TokenConfigurationOrBuilder getTokenConfigurationsOrBuilder(int i) {
        return this.tokenConfigurations_.get(i);
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public List<? extends TokenConfigurationOrBuilder> getTokenConfigurationsOrBuilderList() {
        return this.tokenConfigurations_;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final s8 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public boolean hasAssetCacheConfiguration() {
        return this.assetCacheConfiguration_ != null;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public boolean hasCrashSignalConfig() {
        return this.crashSignalConfig_ != null;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public boolean hasEventConfiguration() {
        return this.eventConfiguration_ != null;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public boolean hasExtras() {
        return this.extras_ != null;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public boolean hasSdkAnalyticConfig() {
        return this.sdkAnalyticConfig_ != null;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public boolean hasSdkAnalyticConfigV2() {
        return this.sdkAnalyticConfigV2_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getEndpoint().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
        if (getEventCount() > 0) {
            iHashCode = getEventList().hashCode() + pv1.c(iHashCode, 37, 2, 53);
        }
        int sessionResetAfter = getSessionResetAfter() + pv1.c(iHashCode, 37, 3, 53);
        if (getAdNetworksCount() > 0) {
            sessionResetAfter = getAdNetworksList().hashCode() + pv1.c(sessionResetAfter, 37, 4, 53);
        }
        int adRequestTmax = getAdRequestTmax() + ((((getAdCacheMaxAge() + z.i(pv1.c(sessionResetAfter, 37, 5, 53), this.adCacheControl_, 37, 6, 53)) * 37) + 7) * 53);
        if (!internalGetAdCachePlacementControl().h().isEmpty()) {
            adRequestTmax = pv1.c(adRequestTmax, 37, 8, 53) + internalGetAdCachePlacementControl().hashCode();
        }
        int adNetworksLoadingTimeout = getAdNetworksLoadingTimeout() + pv1.c(adRequestTmax, 37, 9, 53);
        if (hasSdkAnalyticConfig()) {
            adNetworksLoadingTimeout = getSdkAnalyticConfig().hashCode() + pv1.c(adNetworksLoadingTimeout, 37, 10, 53);
        }
        if (hasEventConfiguration()) {
            adNetworksLoadingTimeout = getEventConfiguration().hashCode() + pv1.c(adNetworksLoadingTimeout, 37, 11, 53);
        }
        if (getTokenConfigurationsCount() > 0) {
            adNetworksLoadingTimeout = getTokenConfigurationsList().hashCode() + pv1.c(adNetworksLoadingTimeout, 37, 12, 53);
        }
        int iC = l5.c(getShowWithoutInternet()) + pv1.c(adNetworksLoadingTimeout, 37, 13, 53);
        if (hasExtras()) {
            iC = getExtras().hashCode() + pv1.c(iC, 37, 14, 53);
        }
        if (hasSdkAnalyticConfigV2()) {
            iC = getSdkAnalyticConfigV2().hashCode() + pv1.c(iC, 37, 15, 53);
        }
        if (hasAssetCacheConfiguration()) {
            iC = getAssetCacheConfiguration().hashCode() + pv1.c(iC, 37, 16, 53);
        }
        int bmifvTtlSessions = getBmifvTtlSessions() + z.i(pv1.c(iC, 37, 17, 53), this.restrictionMode_, 37, 18, 53);
        if (hasCrashSignalConfig()) {
            bmifvTtlSessions = getCrashSignalConfig().hashCode() + pv1.c(bmifvTtlSessions, 37, 19, 53);
        }
        int iHashCode2 = this.unknownFields.a.hashCode() + (bmifvTtlSessions * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.y4
    public w4 internalGetFieldAccessorTable() {
        w4 w4Var = InitProto.internal_static_bidmachine_protobuf_InitResponse_fieldAccessorTable;
        w4Var.c(InitResponse.class, Builder.class);
        return w4Var;
    }

    @Override // com.explorestack.protobuf.y4
    public k6 internalGetMapField(int i) {
        if (i == 8) {
            return internalGetAdCachePlacementControl();
        }
        y.j(pv1.k(i, "Invalid map field number: "));
        return null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.y4
    public Builder newBuilderForType(h4 h4Var) {
        return new Builder(h4Var);
    }

    @Override // com.explorestack.protobuf.y4
    public Object newInstance(x4 x4Var) {
        return new InitResponse();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    private InitResponse(r rVar, o3 o3Var) throws InvalidProtocolBufferException {
        this();
        o3Var.getClass();
        p8 p8VarB = s8.b();
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iF = rVar.F();
                    switch (iF) {
                        case 0:
                            break;
                        case 10:
                            this.endpoint_ = rVar.E();
                            continue;
                        case 18:
                            int i2 = (i == true ? 1 : 0) & 1;
                            i = i;
                            if (i2 == 0) {
                                this.event_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 1;
                            }
                            this.event_.add((Ad.Event) rVar.v(Ad.Event.parser(), o3Var));
                            continue;
                        case 24:
                            this.sessionResetAfter_ = rVar.G();
                            continue;
                        case 34:
                            int i3 = (i == true ? 1 : 0) & 2;
                            i = i;
                            if (i3 == 0) {
                                this.adNetworks_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 2;
                            }
                            this.adNetworks_.add((AdNetwork) rVar.v(AdNetwork.parser(), o3Var));
                            continue;
                        case 40:
                            this.adCacheControl_ = rVar.o();
                            continue;
                        case 48:
                            this.adCacheMaxAge_ = rVar.G();
                            continue;
                        case 56:
                            this.adRequestTmax_ = rVar.G();
                            continue;
                        case 66:
                            int i4 = (i == true ? 1 : 0) & 4;
                            i = i;
                            if (i4 == 0) {
                                this.adCachePlacementControl_ = k6.l(AdCachePlacementControlDefaultEntryHolder.defaultEntry);
                                i = (i == true ? 1 : 0) | 4;
                            }
                            d6 d6Var = (d6) rVar.v(AdCachePlacementControlDefaultEntryHolder.defaultEntry.c.f, o3Var);
                            this.adCachePlacementControl_.j().put(d6Var.a, d6Var.b);
                            continue;
                        case 72:
                            this.adNetworksLoadingTimeout_ = rVar.G();
                            continue;
                        case 82:
                            SdkAnalyticConfig sdkAnalyticConfig = this.sdkAnalyticConfig_;
                            SdkAnalyticConfig.Builder builder = sdkAnalyticConfig != null ? sdkAnalyticConfig.toBuilder() : null;
                            SdkAnalyticConfig sdkAnalyticConfig2 = (SdkAnalyticConfig) rVar.v(SdkAnalyticConfig.parser(), o3Var);
                            this.sdkAnalyticConfig_ = sdkAnalyticConfig2;
                            if (builder != null) {
                                builder.mergeFrom(sdkAnalyticConfig2);
                                this.sdkAnalyticConfig_ = builder.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 90:
                            AdExtension.EventConfiguration eventConfiguration = this.eventConfiguration_;
                            AdExtension.EventConfiguration.Builder builder2 = eventConfiguration != null ? eventConfiguration.toBuilder() : null;
                            AdExtension.EventConfiguration eventConfiguration2 = (AdExtension.EventConfiguration) rVar.v(AdExtension.EventConfiguration.parser(), o3Var);
                            this.eventConfiguration_ = eventConfiguration2;
                            if (builder2 != null) {
                                builder2.mergeFrom(eventConfiguration2);
                                this.eventConfiguration_ = builder2.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 98:
                            int i5 = (i == true ? 1 : 0) & 8;
                            i = i;
                            if (i5 == 0) {
                                this.tokenConfigurations_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 8;
                            }
                            this.tokenConfigurations_.add((TokenConfiguration) rVar.v(TokenConfiguration.parser(), o3Var));
                            continue;
                        case 104:
                            this.showWithoutInternet_ = rVar.l();
                            continue;
                        case ASSET_WRITE_ERROR_VALUE:
                            Extras extras = this.extras_;
                            Extras.Builder builder3 = extras != null ? extras.toBuilder() : null;
                            Extras extras2 = (Extras) rVar.v(Extras.parser(), o3Var);
                            this.extras_ = extras2;
                            if (builder3 != null) {
                                builder3.mergeFrom(extras2);
                                this.extras_ = builder3.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case INVALID_ADS_ENDPOINT_VALUE:
                            Configuration configuration = this.sdkAnalyticConfigV2_;
                            Configuration.Builder builder4 = configuration != null ? configuration.toBuilder() : null;
                            Configuration configuration2 = (Configuration) rVar.v(Configuration.parser(), o3Var);
                            this.sdkAnalyticConfigV2_ = configuration2;
                            if (builder4 != null) {
                                builder4.mergeFrom(configuration2);
                                this.sdkAnalyticConfigV2_ = builder4.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 130:
                            AssetCache.Configuration configuration3 = this.assetCacheConfiguration_;
                            AssetCache.Configuration.Builder builder5 = configuration3 != null ? configuration3.toBuilder() : null;
                            AssetCache.Configuration configuration4 = (AssetCache.Configuration) rVar.v(AssetCache.Configuration.parser(), o3Var);
                            this.assetCacheConfiguration_ = configuration4;
                            if (builder5 != null) {
                                builder5.mergeFrom(configuration4);
                                this.assetCacheConfiguration_ = builder5.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 136:
                            this.restrictionMode_ = rVar.o();
                            continue;
                        case 144:
                            this.bmifvTtlSessions_ = rVar.G();
                            continue;
                        case 154:
                            SdkCrashSignalConfig sdkCrashSignalConfig = this.crashSignalConfig_;
                            SdkCrashSignalConfig.Builder builder6 = sdkCrashSignalConfig != null ? sdkCrashSignalConfig.toBuilder() : null;
                            SdkCrashSignalConfig sdkCrashSignalConfig2 = (SdkCrashSignalConfig) rVar.v(SdkCrashSignalConfig.parser(), o3Var);
                            this.crashSignalConfig_ = sdkCrashSignalConfig2;
                            if (builder6 != null) {
                                builder6.mergeFrom(sdkCrashSignalConfig2);
                                this.crashSignalConfig_ = builder6.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        default:
                            if (!parseUnknownField(rVar, p8VarB, o3Var, iF)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if (((i == true ? 1 : 0) & 1) != 0) {
                    this.event_ = Collections.unmodifiableList(this.event_);
                }
                if (((i == true ? 1 : 0) & 2) != 0) {
                    this.adNetworks_ = Collections.unmodifiableList(this.adNetworks_);
                }
                if (((i == true ? 1 : 0) & 8) != 0) {
                    this.tokenConfigurations_ = Collections.unmodifiableList(this.tokenConfigurations_);
                }
                this.unknownFields = p8VarB.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (((i == true ? 1 : 0) & 1) != 0) {
            this.event_ = Collections.unmodifiableList(this.event_);
        }
        if (((i == true ? 1 : 0) & 2) != 0) {
            this.adNetworks_ = Collections.unmodifiableList(this.adNetworks_);
        }
        if (((i == true ? 1 : 0) & 8) != 0) {
            this.tokenConfigurations_ = Collections.unmodifiableList(this.tokenConfigurations_);
        }
        this.unknownFields = p8VarB.build();
        makeExtensionsImmutable();
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public boolean containsAdCachePlacementControl(String str) {
        str.getClass();
        return internalGetAdCachePlacementControl().h().containsKey(str);
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    @Deprecated
    public Map<String, AdCachePlacementControl> getAdCachePlacementControl() {
        return getAdCachePlacementControlMap();
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public int getAdCachePlacementControlCount() {
        return internalGetAdCachePlacementControl().h().size();
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public Map<String, AdCachePlacementControl> getAdCachePlacementControlMap() {
        return internalGetAdCachePlacementControl().h();
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public AdCachePlacementControl getAdCachePlacementControlOrDefault(String str, AdCachePlacementControl adCachePlacementControl) {
        str.getClass();
        Map mapH = internalGetAdCachePlacementControl().h();
        if (mapH.containsKey(str)) {
            return (AdCachePlacementControl) mapH.get(str);
        }
        return adCachePlacementControl;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public AdCachePlacementControl getAdCachePlacementControlOrThrow(String str) {
        str.getClass();
        Map mapH = internalGetAdCachePlacementControl().h();
        if (mapH.containsKey(str)) {
            return (AdCachePlacementControl) mapH.get(str);
        }
        e32.a();
        return null;
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public AssetCache.ConfigurationOrBuilder getAssetCacheConfigurationOrBuilder() {
        return getAssetCacheConfiguration();
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public SdkCrashSignalConfigOrBuilder getCrashSignalConfigOrBuilder() {
        return getCrashSignalConfig();
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public AdExtension.EventConfigurationOrBuilder getEventConfigurationOrBuilder() {
        return getEventConfiguration();
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public ExtrasOrBuilder getExtrasOrBuilder() {
        return getExtras();
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public SdkAnalyticConfigOrBuilder getSdkAnalyticConfigOrBuilder() {
        return getSdkAnalyticConfig();
    }

    @Override // io.p071bidmachine.protobuf.InitResponseOrBuilder
    public ConfigurationOrBuilder getSdkAnalyticConfigV2OrBuilder() {
        return getSdkAnalyticConfigV2();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(w wVar) throws IOException {
        if (!getEndpointBytes().isEmpty()) {
            y4.writeString(wVar, 1, this.endpoint_);
        }
        for (int i = 0; i < this.event_.size(); i++) {
            wVar.M(2, this.event_.get(i));
        }
        int i2 = this.sessionResetAfter_;
        if (i2 != 0) {
            wVar.T(3, i2);
        }
        for (int i3 = 0; i3 < this.adNetworks_.size(); i3++) {
            wVar.M(4, this.adNetworks_.get(i3));
        }
        if (this.adCacheControl_ != AdCacheControl.AD_CACHE_CONTROL_DISABLED.getNumber()) {
            wVar.K(5, this.adCacheControl_);
        }
        int i4 = this.adCacheMaxAge_;
        if (i4 != 0) {
            wVar.T(6, i4);
        }
        int i5 = this.adRequestTmax_;
        if (i5 != 0) {
            wVar.T(7, i5);
        }
        y4.serializeStringMapTo(wVar, internalGetAdCachePlacementControl(), AdCachePlacementControlDefaultEntryHolder.defaultEntry, 8);
        int i6 = this.adNetworksLoadingTimeout_;
        if (i6 != 0) {
            wVar.T(9, i6);
        }
        if (this.sdkAnalyticConfig_ != null) {
            wVar.M(10, getSdkAnalyticConfig());
        }
        if (this.eventConfiguration_ != null) {
            wVar.M(11, getEventConfiguration());
        }
        for (int i7 = 0; i7 < this.tokenConfigurations_.size(); i7++) {
            wVar.M(12, this.tokenConfigurations_.get(i7));
        }
        boolean z = this.showWithoutInternet_;
        if (z) {
            wVar.A(13, z);
        }
        if (this.extras_ != null) {
            wVar.M(14, getExtras());
        }
        if (this.sdkAnalyticConfigV2_ != null) {
            wVar.M(15, getSdkAnalyticConfigV2());
        }
        if (this.assetCacheConfiguration_ != null) {
            wVar.M(16, getAssetCacheConfiguration());
        }
        if (this.restrictionMode_ != RestrictionMode.RESTRICTION_MODE_STRICT.getNumber()) {
            wVar.K(17, this.restrictionMode_);
        }
        int i8 = this.bmifvTtlSessions_;
        if (i8 != 0) {
            wVar.T(18, i8);
        }
        if (this.crashSignalConfig_ != null) {
            wVar.M(19, getCrashSignalConfig());
        }
        this.unknownFields.writeTo(wVar);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public InitResponse mo250getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static InitResponse parseDelimitedFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (InitResponse) y4.parseDelimitedWithIOException(PARSER, inputStream, o3Var);
    }

    public static InitResponse parseFrom(ByteBuffer byteBuffer, o3 o3Var) throws InvalidProtocolBufferException {
        return (InitResponse) PARSER.parseFrom(byteBuffer, o3Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static InitResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (InitResponse) PARSER.parseFrom(byteString);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static InitResponse parseFrom(ByteString byteString, o3 o3Var) throws InvalidProtocolBufferException {
        return (InitResponse) PARSER.parseFrom(byteString, o3Var);
    }

    public static InitResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (InitResponse) PARSER.parseFrom(bArr);
    }

    public static InitResponse parseFrom(byte[] bArr, o3 o3Var) throws InvalidProtocolBufferException {
        return (InitResponse) PARSER.parseFrom(bArr, o3Var);
    }

    public static InitResponse parseFrom(InputStream inputStream) throws IOException {
        return (InitResponse) y4.parseWithIOException(PARSER, inputStream);
    }

    public static InitResponse parseFrom(InputStream inputStream, o3 o3Var) throws IOException {
        return (InitResponse) y4.parseWithIOException(PARSER, inputStream, o3Var);
    }

    public static InitResponse parseFrom(r rVar) throws IOException {
        return (InitResponse) y4.parseWithIOException(PARSER, rVar);
    }

    public static InitResponse parseFrom(r rVar, o3 o3Var) throws IOException {
        return (InitResponse) y4.parseWithIOException(PARSER, rVar, o3Var);
    }

    private InitResponse(g4 g4Var) {
        super(g4Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    private InitResponse() {
        this.memoizedIsInitialized = (byte) -1;
        this.endpoint_ = "";
        List list = Collections.EMPTY_LIST;
        this.event_ = list;
        this.adNetworks_ = list;
        this.adCacheControl_ = 0;
        this.tokenConfigurations_ = list;
        this.restrictionMode_ = 0;
    }
}
