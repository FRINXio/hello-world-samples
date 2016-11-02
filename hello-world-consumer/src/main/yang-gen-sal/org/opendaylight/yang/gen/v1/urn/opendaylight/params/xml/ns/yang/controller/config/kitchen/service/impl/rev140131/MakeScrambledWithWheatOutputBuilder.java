package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput
 *
 */
public class MakeScrambledWithWheatOutputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput> {

    private java.lang.Boolean _result;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput>> augmentation = Collections.emptyMap();

    public MakeScrambledWithWheatOutputBuilder() {
    }

    public MakeScrambledWithWheatOutputBuilder(MakeScrambledWithWheatOutput base) {
        this._result = base.isResult();
        if (base instanceof MakeScrambledWithWheatOutputImpl) {
            MakeScrambledWithWheatOutputImpl impl = (MakeScrambledWithWheatOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Boolean isResult() {
        return _result;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public MakeScrambledWithWheatOutputBuilder setResult(final java.lang.Boolean value) {
        this._result = value;
        return this;
    }
    
    public MakeScrambledWithWheatOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public MakeScrambledWithWheatOutputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public MakeScrambledWithWheatOutput build() {
        return new MakeScrambledWithWheatOutputImpl(this);
    }

    private static final class MakeScrambledWithWheatOutputImpl implements MakeScrambledWithWheatOutput {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput.class;
        }

        private final java.lang.Boolean _result;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput>> augmentation = Collections.emptyMap();

        private MakeScrambledWithWheatOutputImpl(MakeScrambledWithWheatOutputBuilder base) {
            this._result = base.isResult();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Boolean isResult() {
            return _result;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_result);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput)obj;
            if (!Objects.equals(_result, other.isResult())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MakeScrambledWithWheatOutputImpl otherImpl = (MakeScrambledWithWheatOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("MakeScrambledWithWheatOutput [");
            boolean first = true;
        
            if (_result != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_result=");
                builder.append(_result);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
