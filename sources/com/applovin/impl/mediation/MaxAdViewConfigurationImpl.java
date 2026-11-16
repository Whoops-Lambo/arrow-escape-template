package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import com.applovin.impl.sdk.p;
import com.applovin.mediation.MaxAdViewConfiguration;
import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class MaxAdViewConfigurationImpl implements MaxAdViewConfiguration {
    private final MaxAdViewConfiguration.AdaptiveType a;
    private final int b;
    private final int c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class BuilderImpl implements MaxAdViewConfiguration.Builder {
        private MaxAdViewConfiguration.AdaptiveType a = MaxAdViewConfiguration.AdaptiveType.NONE;
        private int b = -1;
        private int c = -1;

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration build() {
            return new MaxAdViewConfigurationImpl(this);
        }

        public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
            return this.a;
        }

        public int getAdaptiveWidth() {
            return this.b;
        }

        public int getInlineMaximumHeight() {
            return this.c;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveType(MaxAdViewConfiguration.AdaptiveType adaptiveType) {
            p.e("MaxAdViewConfiguration", "setAdaptiveType(adaptiveType=" + adaptiveType + ")");
            this.a = adaptiveType;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveWidth(int i) {
            p.e("MaxAdViewConfiguration", "setAdaptiveWidth(adaptiveWidth=" + i + ")");
            this.b = i;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setInlineMaximumHeight(int i) {
            p.e("MaxAdViewConfiguration", "setInlineMaximumHeight(inlineMaximumHeight=" + i + ")");
            this.c = i;
            return this;
        }

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder("MaxAdViewConfiguration.Builder{adaptiveType=");
            sb.append(this.a);
            sb.append(", adaptiveWidth=");
            sb.append(this.b);
            sb.append(", inlineMaximumHeight=");
            return nj.l(this.c, "}", sb);
        }
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
        return this.a;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getAdaptiveWidth() {
        return this.b;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getInlineMaximumHeight() {
        return this.c;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MaxAdViewConfiguration{adaptiveType=");
        sb.append(this.a);
        sb.append(", adaptiveWidth=");
        sb.append(this.b);
        sb.append(", inlineMaximumHeight=");
        return nj.l(this.c, "}", sb);
    }

    private MaxAdViewConfigurationImpl(BuilderImpl builderImpl) {
        this.a = builderImpl.a;
        this.b = builderImpl.b;
        this.c = builderImpl.c;
    }
}
