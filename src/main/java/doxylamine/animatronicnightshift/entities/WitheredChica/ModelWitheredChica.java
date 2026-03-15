package doxylamine.animatronicnightshift.entities.WitheredChica;// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import doxylamine.animatronicnightshift.entities.FreddyFazbear.FreddyFazbearAnimation;
import doxylamine.animatronicnightshift.entities.WitheredFreddy.ModelWitheredFreddyAnimations;
import doxylamine.animatronicnightshift.entities.WitheredFreddy.WitheredFreddy;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class ModelWitheredChica<T extends WitheredChica> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	private final ModelPart bone7;
	private final ModelPart corps;
	private final ModelPart brasdroit;
	private final ModelPart bone10;
	private final ModelPart bone12;
	private final ModelPart brasgauche;
	private final ModelPart bone23;
	private final ModelPart bone24;
	private final ModelPart tete;
	private final ModelPart bone5;
	private final ModelPart Machoire;
	private final ModelPart bone4;
	private final ModelPart bone6;
	private final ModelPart oreilledroite;
	private final ModelPart bone21;
	private final ModelPart jambedroite;
	private final ModelPart bone;
	private final ModelPart bone17;
	private final ModelPart jambegauche;
	private final ModelPart bone3;
	private final ModelPart bone9;

	public ModelWitheredChica(ModelPart root) {
		this.bone7 = root.getChild("bone7");
		this.corps = this.bone7.getChild("corps");
		this.brasdroit = this.corps.getChild("brasdroit");
		this.bone10 = this.brasdroit.getChild("bone10");
		this.bone12 = this.bone10.getChild("bone12");
		this.brasgauche = this.corps.getChild("brasgauche");
		this.bone23 = this.brasgauche.getChild("bone23");
		this.bone24 = this.bone23.getChild("bone24");
		this.tete = this.corps.getChild("tete");
		this.bone5 = this.tete.getChild("bone5");
		this.Machoire = this.tete.getChild("Machoire");
		this.bone4 = this.tete.getChild("bone4");
		this.bone6 = this.tete.getChild("bone6");
		this.oreilledroite = this.tete.getChild("oreilledroite");
		this.bone21 = this.tete.getChild("bone21");
		this.jambedroite = this.bone7.getChild("jambedroite");
		this.bone = this.jambedroite.getChild("bone");
		this.bone17 = this.bone.getChild("bone17");
		this.jambegauche = this.bone7.getChild("jambegauche");
		this.bone3 = this.jambegauche.getChild("bone3");
		this.bone9 = this.bone3.getChild("bone9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone7 = partdefinition.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(0, 31).addBox(-4.5F, -17.0F, -4.0F, 10.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(54, 55).addBox(-1.5F, -15.0F, -4.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 18.0F, 0.0F));

		PartDefinition corps = bone7.addOrReplaceChild("corps", CubeListBuilder.create().texOffs(0, 20).addBox(-4.5F, -15.0F, -3.5F, 9.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-5.5F, -11.0F, -4.5F, 11.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(40, 18).addBox(-4.5F, -14.25F, -0.25F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(70, 67).addBox(-1.5F, -17.25F, -1.25F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(64, 0).addBox(-1.0F, -14.25F, -0.75F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(16, 66).addBox(-3.0F, -1.25F, -1.25F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(24, 71).addBox(-3.0F, -11.25F, -0.725F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(72, 0).addBox(-3.0F, -9.25F, -0.725F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(72, 3).addBox(-3.0F, -7.25F, -0.725F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(103, 35).addBox(-4.5F, -10.55F, -5.125F, 9.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 53).addBox(-3.5F, -15.225F, -3.4F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -17.0F, -0.5F));

		PartDefinition cube_r1 = corps.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(105, 46).addBox(-3.5F, -3.0F, -0.5F, 7.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.25F, -3.975F, -0.3491F, 0.0F, 0.0F));

		PartDefinition brasdroit = corps.addOrReplaceChild("brasdroit", CubeListBuilder.create().texOffs(76, 59).addBox(-3.8674F, -0.0382F, -1.0354F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -11.0F, 0.0F, -0.0137F, 0.03F, 1.4401F));

		PartDefinition bone10 = brasdroit.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(62, 18).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(50, 66).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 74).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(82, 67).addBox(-1.0F, 8.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6174F, 0.9618F, -0.0354F, 0.0F, 0.0F, 0.0873F));

		PartDefinition bone12 = bone10.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(87, 16).addBox(-2.0F, 0.0F, -1.5F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(44, 82).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(78, 26).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.5F, -0.5F, 0.0092F, -0.0036F, -0.0431F));

		PartDefinition cube_r2 = bone12.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 106).addBox(0.0F, -0.5F, -0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 6.5F, 0.5F, 0.0F, 0.0436F, 0.3054F));

		PartDefinition cube_r3 = bone12.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 109).addBox(0.0F, -0.5F, -0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 6.5F, 0.75F, -0.0018F, -0.0434F, 0.3F));

		PartDefinition cube_r4 = bone12.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 115).addBox(0.0F, -0.5F, -0.5F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 6.5F, 1.0F, 0.0F, -0.0873F, 0.0873F));

		PartDefinition cube_r5 = bone12.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 100).addBox(0.0F, -0.5F, -0.5F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.5F, 0.0F, 0.0F, 0.0436F, 0.1745F));

		PartDefinition brasgauche = corps.addOrReplaceChild("brasgauche", CubeListBuilder.create().texOffs(0, 80).addBox(-0.1326F, -0.0382F, -1.0354F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -11.0F, 0.0F, -0.0137F, -0.03F, -1.4401F));

		PartDefinition bone23 = brasgauche.addOrReplaceChild("bone23", CubeListBuilder.create().texOffs(54, 63).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(56, 80).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 74).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(82, 76).addBox(-1.0F, 8.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6174F, 0.9618F, -0.0354F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone24 = bone23.addOrReplaceChild("bone24", CubeListBuilder.create().texOffs(40, 82).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(78, 17).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(62, 30).mirror().addBox(-2.0F, 0.0F, -1.5F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.5F, -0.5F, 0.0092F, 0.0036F, 0.0431F));

		PartDefinition cube_r6 = bone24.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 103).mirror().addBox(-12.0F, -0.5F, -0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.25F, 6.5F, 0.5F, 0.0F, -0.0436F, -0.3054F));

		PartDefinition cube_r7 = bone24.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(-14.0F, -0.5F, -0.5F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.25F, 6.5F, 1.0F, 0.0F, 0.0873F, -0.0873F));

		PartDefinition cube_r8 = bone24.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 112).mirror().addBox(-13.0F, -0.5F, -0.5F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 6.5F, 0.0F, 0.0F, -0.0436F, -0.1745F));

		PartDefinition cube_r9 = bone24.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 94).addBox(-12.0F, -0.5F, -0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.5F, 0.75F, -0.0018F, 0.0434F, -0.3F));

		PartDefinition tete = corps.addOrReplaceChild("tete", CubeListBuilder.create().texOffs(40, 11).addBox(-3.0F, -9.0F, -3.5F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(34, 31).addBox(-3.5F, -5.0F, -4.0F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(71, 121).addBox(-1.5F, -2.75F, -5.1F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(84, 118).addBox(-1.5F, -6.75F, -3.1F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(50, 121).addBox(-1.5F, -1.75F, -5.1F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(96, 0).addBox(-2.0F, -4.0F, -7.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(114, 73).addBox(-2.0F, -2.0F, -7.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(111, 0).addBox(-1.0F, -4.0F, -8.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(111, 4).addBox(-1.0F, -2.0F, -8.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 40).addBox(-3.5F, -8.0F, -4.0F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(16, 82).addBox(0.5F, -6.0F, -3.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(18, 50).addBox(0.825F, -5.0F, -3.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(70, 80).addBox(-2.5F, -6.0F, -3.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 50).addBox(-1.825F, -5.0F, -3.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -19.0F, 0.5F, -0.0427F, 0.0104F, 0.0072F));

		PartDefinition cube_r10 = tete.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(97, 5).addBox(-1.0F, -0.5F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.6F, -5.25F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r11 = tete.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(73, 54).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -8.75F, -0.5F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r12 = tete.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(73, 55).mirror().addBox(-1.5F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -8.9F, -1.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r13 = tete.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(73, 54).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -8.75F, -0.5F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r14 = tete.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(73, 55).mirror().addBox(-1.5F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -8.55F, 0.875F, -0.3927F, 0.0F, 0.0F));

		PartDefinition bone5 = tete.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(1.0F, -10.5F, 1.0F));

		PartDefinition Machoire = tete.addOrReplaceChild("Machoire", CubeListBuilder.create().texOffs(1, 124).addBox(-2.0F, -0.0545F, -10.1193F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(3, 125).addBox(-1.0F, -0.0545F, -11.1193F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 28).mirror().addBox(-3.0F, -0.0545F, -8.1193F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(40, 28).mirror().addBox(-3.0F, -1.0545F, -8.1193F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1, 124).addBox(-2.0F, -1.0545F, -10.1193F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(3, 125).addBox(-1.0F, -1.0545F, -11.1193F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(33, 22).mirror().addBox(-3.5F, -0.0545F, -7.1193F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(71, 121).mirror().addBox(-1.5F, -0.3045F, -8.1193F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(50, 121).mirror().addBox(-1.5F, -1.3045F, -8.1193F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(99, 123).mirror().addBox(2.0F, -4.0545F, -4.6193F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(99, 123).mirror().addBox(2.0F, -4.0545F, -3.1193F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(99, 123).mirror().addBox(2.0F, -4.0545F, -1.6193F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(99, 123).mirror().addBox(-3.0F, -4.0545F, -1.6193F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(99, 123).mirror().addBox(-3.0F, -4.0545F, -3.1193F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(99, 123).mirror().addBox(-3.0F, -4.0545F, -4.6693F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.25F, 3.15F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone4 = tete.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.75F, -8.75F, 0.5F, 0.0F, 0.0F, -0.9599F));

		PartDefinition bone6 = tete.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(3.75F, -8.75F, 0.5F, 0.0F, 0.0F, 0.9599F));

		PartDefinition oreilledroite = tete.addOrReplaceChild("oreilledroite", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.25F, -7.0F, -0.5F, 0.0F, 0.0F, -1.0036F));

		PartDefinition bone21 = tete.addOrReplaceChild("bone21", CubeListBuilder.create(), PartPose.offsetAndRotation(2.25F, -7.0F, -0.5F, 0.0F, 0.0F, 1.0036F));

		PartDefinition jambedroite = bone7.addOrReplaceChild("jambedroite", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, -14.5F, -1.75F, 0.1282F, -0.0205F, -0.0065F));

		PartDefinition cube_r15 = jambedroite.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(36, 52).addBox(-4.0F, -0.7692F, -1.7063F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.25F, 0.0F, -0.1309F, 0.2182F, 0.0F));

		PartDefinition cube_r16 = jambedroite.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(60, 82).addBox(-3.0F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, 0.5F, -0.1309F, 0.2182F, 0.0F));

		PartDefinition cube_r17 = jambedroite.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(52, 80).addBox(-3.0F, -0.7692F, 0.2937F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.35F, -0.25F, -0.225F, -0.1309F, 0.2182F, 0.0F));

		PartDefinition cube_r18 = jambedroite.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(16, 71).addBox(-3.0F, -0.7692F, 0.2937F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, -0.25F, -0.625F, -0.1309F, 0.2182F, 0.0F));

		PartDefinition bone = jambedroite.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-1.25F, 8.5F, 0.0F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(54, 41).addBox(-3.7836F, 0.0407F, -2.8881F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(80, 6).addBox(-2.8049F, 9.0489F, -1.7621F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(72, 6).addBox(-3.7836F, 0.0407F, -2.8881F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.225F, 0.25F, 1.225F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(12, 75).addBox(-2.7836F, 0.0407F, -1.8881F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.725F, 0.25F, 0.725F, 0.0F, 0.2182F, 0.0F));

		PartDefinition bone17 = bone.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offset(0.25F, 10.0F, 0.0F));

		PartDefinition cube_r22 = bone17.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(61, 86).mirror().addBox(-3.7767F, -0.6593F, -5.8886F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.75F, 0.0F, 0.0F, -0.134F, 0.2156F, -0.0318F));

		PartDefinition jambegauche = bone7.addOrReplaceChild("jambegauche", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, -14.5F, -1.75F, 0.1282F, 0.0205F, 0.0065F));

		PartDefinition cube_r23 = jambegauche.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(72, 41).addBox(1.0F, -0.7692F, 0.2937F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, -0.25F, -0.625F, -0.1309F, -0.2182F, 0.0F));

		PartDefinition cube_r24 = jambegauche.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(82, 73).addBox(1.0F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0F, 0.5F, -0.1309F, -0.2182F, 0.0F));

		PartDefinition cube_r25 = jambegauche.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(18, 52).addBox(0.0F, -0.7692F, -1.7063F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.25F, 0.0F, -0.1309F, -0.2182F, 0.0F));

		PartDefinition cube_r26 = jambegauche.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(80, 40).addBox(2.0F, -0.7692F, 0.2937F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.35F, -0.25F, -0.225F, -0.1309F, -0.2182F, 0.0F));

		PartDefinition bone3 = jambegauche.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(1.25F, 8.5F, 0.0F));

		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(48, 80).addBox(1.7836F, 0.0407F, -1.8881F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.725F, 0.25F, 0.725F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(40, 71).addBox(1.7836F, 0.0407F, -2.8881F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.225F, 0.25F, 1.225F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 50).addBox(-0.2164F, 0.0407F, -2.8881F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(80, 10).addBox(0.8049F, 9.0489F, -1.7621F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition bone9 = bone3.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(-0.25F, 10.0F, 0.0F));

		PartDefinition cube_r30 = bone9.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(30, 41).addBox(-0.2233F, -0.6593F, -5.8886F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.75F, 0.0F, 0.0F, -0.134F, -0.2156F, 0.0318F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

    @Override
    public ModelPart root() {
        return bone7;
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.animate(((WitheredChica) entity).crawlingAnimationState, FreddyFazbearAnimation.crawl, ageInTicks, 1f);
        this.animate(((WitheredChica) entity).idleAnimationState, ModelWitheredChicaAnimations.lying, ageInTicks, 1f);


        this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

        this.jambedroite.xRot += Mth.cos(limbSwing * 0.3F) * 0.8F * limbSwingAmount * 0.5F;
        this.jambegauche.xRot += Mth.cos(limbSwing * 0.3F + (float)Math.PI) * 0.8F * limbSwingAmount * 0.5F;
        this.jambedroite.yRot += 0.0F;
        this.jambegauche.yRot += 0.0F;

        this.brasgauche.xRot += Mth.cos(limbSwing * 0.3F) * 0.8F * limbSwingAmount * 0.5F;
        this.brasdroit.xRot += Mth.cos(limbSwing * 0.3F + (float)Math.PI) * 0.8F * limbSwingAmount * 0.5F;
        this.brasgauche.yRot += 0.0F;
        this.brasdroit.yRot += 0.0F;

    }

    private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {

        float yawClamped = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
        float pitchClamped = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

        float yawRad = yawClamped * ((float)Math.PI / 180F);
        float pitchRad = pitchClamped * ((float)Math.PI / 180F);

        this.tete.yRot += yawRad;
        this.tete.xRot += pitchRad;
    }
}