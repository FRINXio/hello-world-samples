package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster.ToasterStatus;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster} instances.
 *
 * @see org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster
 *
 */
public class ToasterBuilder implements Builder <org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster> {

    private java.lang.Long _darknessFactor;
    private DisplayString _toasterManufacturer;
    private DisplayString _toasterModelNumber;
    private ToasterStatus _toasterStatus;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>> augmentation = Collections.emptyMap();

    public ToasterBuilder() {
    }

    public ToasterBuilder(Toaster base) {
        this._darknessFactor = base.getDarknessFactor();
        this._toasterManufacturer = base.getToasterManufacturer();
        this._toasterModelNumber = base.getToasterModelNumber();
        this._toasterStatus = base.getToasterStatus();
        if (base instanceof ToasterImpl) {
            ToasterImpl impl = (ToasterImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Long getDarknessFactor() {
        return _darknessFactor;
    }
    
    public DisplayString getToasterManufacturer() {
        return _toasterManufacturer;
    }
    
    public DisplayString getToasterModelNumber() {
        return _toasterModelNumber;
    }
    
    public ToasterStatus getToasterStatus() {
        return _toasterStatus;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkDarknessFactorRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥4294967295]].", value));
     }
    
    public ToasterBuilder setDarknessFactor(final java.lang.Long value) {
    if (value != null) {
        checkDarknessFactorRange(value);
    }
        this._darknessFactor = value;
        return this;
    }
    
     
    public ToasterBuilder setToasterManufacturer(final DisplayString value) {
        this._toasterManufacturer = value;
        return this;
    }
    
     
    public ToasterBuilder setToasterModelNumber(final DisplayString value) {
        this._toasterModelNumber = value;
        return this;
    }
    
     
    public ToasterBuilder setToasterStatus(final ToasterStatus value) {
        this._toasterStatus = value;
        return this;
    }
    
    public ToasterBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public ToasterBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public Toaster build() {
        return new ToasterImpl(this);
    }

    private static final class ToasterImpl implements Toaster {

        public java.lang.Class<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster.class;
        }

        private final java.lang.Long _darknessFactor;
        private final DisplayString _toasterManufacturer;
        private final DisplayString _toasterModelNumber;
        private final ToasterStatus _toasterStatus;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>> augmentation = Collections.emptyMap();

        private ToasterImpl(ToasterBuilder base) {
            this._darknessFactor = base.getDarknessFactor();
            this._toasterManufacturer = base.getToasterManufacturer();
            this._toasterModelNumber = base.getToasterModelNumber();
            this._toasterStatus = base.getToasterStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getDarknessFactor() {
            return _darknessFactor;
        }
        
        @Override
        public DisplayString getToasterManufacturer() {
            return _toasterManufacturer;
        }
        
        @Override
        public DisplayString getToasterModelNumber() {
            return _toasterModelNumber;
        }
        
        @Override
        public ToasterStatus getToasterStatus() {
            return _toasterStatus;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_darknessFactor);
            result = prime * result + Objects.hashCode(_toasterManufacturer);
            result = prime * result + Objects.hashCode(_toasterModelNumber);
            result = prime * result + Objects.hashCode(_toasterStatus);
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
            if (!org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster other = (org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster)obj;
            if (!Objects.equals(_darknessFactor, other.getDarknessFactor())) {
                return false;
            }
            if (!Objects.equals(_toasterManufacturer, other.getToasterManufacturer())) {
                return false;
            }
            if (!Objects.equals(_toasterModelNumber, other.getToasterModelNumber())) {
                return false;
            }
            if (!Objects.equals(_toasterStatus, other.getToasterStatus())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ToasterImpl otherImpl = (ToasterImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Toaster [");
            boolean first = true;
        
            if (_darknessFactor != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_darknessFactor=");
                builder.append(_darknessFactor);
             }
            if (_toasterManufacturer != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_toasterManufacturer=");
                builder.append(_toasterManufacturer);
             }
            if (_toasterModelNumber != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_toasterModelNumber=");
                builder.append(_toasterModelNumber);
             }
            if (_toasterStatus != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_toasterStatus=");
                builder.append(_toasterStatus);
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
