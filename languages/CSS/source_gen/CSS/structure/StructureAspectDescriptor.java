package CSS.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import jetbrains.mps.smodel.runtime.DataTypeDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;
import jetbrains.mps.smodel.adapter.ids.PrimitiveTypeId;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptCSS_Declaration = createDescriptorForCSS_Declaration();
  /*package*/ final ConceptDescriptor myConceptCSS_Declaration_Block = createDescriptorForCSS_Declaration_Block();
  /*package*/ final ConceptDescriptor myConceptCSS_File = createDescriptorForCSS_File();
  /*package*/ final ConceptDescriptor myConceptCSS_Ruleset = createDescriptorForCSS_Ruleset();
  /*package*/ final ConceptDescriptor myConceptCSS_Selector = createDescriptorForCSS_Selector();
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptCSS_Declaration, myConceptCSS_Declaration_Block, myConceptCSS_File, myConceptCSS_Ruleset, myConceptCSS_Selector);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.CSS_Declaration:
        return myConceptCSS_Declaration;
      case LanguageConceptSwitch.CSS_Declaration_Block:
        return myConceptCSS_Declaration_Block;
      case LanguageConceptSwitch.CSS_File:
        return myConceptCSS_File;
      case LanguageConceptSwitch.CSS_Ruleset:
        return myConceptCSS_Ruleset;
      case LanguageConceptSwitch.CSS_Selector:
        return myConceptCSS_Selector;
      default:
        return null;
    }
  }

  @Override
  public Collection<DataTypeDescriptor> getDataTypeDescriptors() {
    return Arrays.asList();
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myIndexSwitch.index(c);
  }

  private static ConceptDescriptor createDescriptorForCSS_Declaration() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("CSS", "CSS_Declaration", 0xb9f4bf860f3d4271L, 0x8f07abe516407b4aL, 0x6fc2a5dc202eb7a3L);
    b.class_(false, false, false);
    b.origin("r:59ac4b71-41ed-47d2-bf8b-0f44119e2363(CSS.structure)/8053181448543188899");
    b.version(2);
    b.property("property", 0x6fc2a5dc202eb7a8L).type(PrimitiveTypeId.STRING).origin("8053181448543188904").done();
    b.property("value", 0x6fc2a5dc202eb7aaL).type(PrimitiveTypeId.STRING).origin("8053181448543188906").done();
    b.alias("declaration");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCSS_Declaration_Block() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("CSS", "CSS_Declaration_Block", 0xb9f4bf860f3d4271L, 0x8f07abe516407b4aL, 0x6fc2a5dc202eb7a5L);
    b.class_(false, false, false);
    b.origin("r:59ac4b71-41ed-47d2-bf8b-0f44119e2363(CSS.structure)/8053181448543188901");
    b.version(2);
    b.aggregate("declarations", 0x6fc2a5dc202eb7c1L).target(0xb9f4bf860f3d4271L, 0x8f07abe516407b4aL, 0x6fc2a5dc202eb7a3L).optional(true).ordered(true).multiple(true).origin("8053181448543188929").done();
    b.alias("declaration block");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCSS_File() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("CSS", "CSS_File", 0xb9f4bf860f3d4271L, 0x8f07abe516407b4aL, 0x6fc2a5dc202eb7a6L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:59ac4b71-41ed-47d2-bf8b-0f44119e2363(CSS.structure)/8053181448543188902");
    b.version(2);
    b.aggregate("rulesets", 0x6fc2a5dc202ec008L).target(0xb9f4bf860f3d4271L, 0x8f07abe516407b4aL, 0x6fc2a5dc202eb7a7L).optional(true).ordered(true).multiple(true).origin("8053181448543191048").done();
    b.alias("css file");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCSS_Ruleset() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("CSS", "CSS_Ruleset", 0xb9f4bf860f3d4271L, 0x8f07abe516407b4aL, 0x6fc2a5dc202eb7a7L);
    b.class_(false, false, false);
    b.origin("r:59ac4b71-41ed-47d2-bf8b-0f44119e2363(CSS.structure)/8053181448543188903");
    b.version(2);
    b.aggregate("selectors", 0x6fc2a5dc202ebfbbL).target(0xb9f4bf860f3d4271L, 0x8f07abe516407b4aL, 0x6fc2a5dc202eb7a4L).optional(false).ordered(true).multiple(true).origin("8053181448543190971").done();
    b.aggregate("block", 0x6fc2a5dc202ebfbdL).target(0xb9f4bf860f3d4271L, 0x8f07abe516407b4aL, 0x6fc2a5dc202eb7a5L).optional(false).ordered(true).multiple(false).origin("8053181448543190973").done();
    b.alias("ruleset");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCSS_Selector() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("CSS", "CSS_Selector", 0xb9f4bf860f3d4271L, 0x8f07abe516407b4aL, 0x6fc2a5dc202eb7a4L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:59ac4b71-41ed-47d2-bf8b-0f44119e2363(CSS.structure)/8053181448543188900");
    b.version(2);
    b.alias("selector");
    return b.create();
  }
}
