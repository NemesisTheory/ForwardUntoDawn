package ft.content;

import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.pattern.*;
import mindustry.world.blocks.production.Drill;
import mindustry.world.draw.*;
import mindustry.content.StatusEffects;
import mindustry.content.Items;
import mindustry.content.Fx;
import mindustry.gen.Sounds;
import arc.graphics.Color;
import mindustry.content.*;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.graphics.Pal;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.meta.BuildVisibility;
import mindustry.world.blocks.defense.*;

import static mindustry.type.ItemStack.with;

public class FlareBlocks {
    public static ItemTurret reverence;
    public static ItemTurret venerate;
    public static ItemTurret fart;
    public static GenericCrafter flareMaterializer;
    public static GenericCrafter susgeUnifier;
    public static GenericCrafter flarogusIntegrator;
    public static GenericCrafter shitHardener;
    public static Drill foskerDrill;
    public static Wall draetheumWall;

    public static void load() {

        reverence = new ItemTurret("reverence") {{
            requirements(Category.turret, with(Items.copper, 820, Items.graphite, 655, Items.titanium, 650, Items.silicon, 455, Items.thorium, 250));
            ammo(
                    Items.pyratite, new BasicBulletType(8f, 35) {{
                        hitSize = 6f;
                        width = 12f;
                        height = 16;
                        frontColor = Pal.lightishOrange;
                        backColor = Pal.lightOrange;
                        status = StatusEffects.burning;
                        statusDuration = 1080f;
                        lifetime = 20f;
                        collidesAir = true;
                        hitEffect = Fx.colorSparkBig;
                        smokeEffect = Fx.fireSmoke;
                        shootEffect = Fx.shootBig;
                        despawnEffect = Fx.fire;
                        pierce = false;
                        incendAmount = 1;
                        incendSpread = 5f;
                        incendChance = 0.85f;
                        fragOnHit = true;
                        hittable = true;
                        hitEffect = new MultiEffect(Fx.hitBulletSmall, Fx.fireHit);
                        makeFire = true;
                        ammoMultiplier = 3;
                        splashDamage = 185f;
                        splashDamageRadius = 86f;
                        knockback = 0.2f;
                    }},
                    FlareItems.flareItem, new BasicBulletType(5f, 150) {{
                        hitSize = 4f;
                        width = 12f;
                        height = 16f;
                        ammoMultiplier = 1;
                        splashDamage = 60;
                        splashDamageRadius = 45;
                        reloadMultiplier = 1.38f;
                        frontColor = Pal.lightOrange;
                        backColor = Pal.lighterOrange;
                        shootEffect = Fx.shootBig;
                        lifetime = 40f;
                        rangeChange = 20f;
                        collidesAir = true;
                        hitEffect = Fx.colorSparkBig;
                        smokeEffect = Fx.fireSmoke;
                        despawnEffect = Fx.fire;
                        pierce = true;
                        pierceCap = 6;
                        status = FlareStatus.flareStatus;
                        statusDuration = 420f;
                        makeFire = true;
                        incendAmount = 1;
                        incendSpread = 5;
                        incendChance = 0.85f;
                        fragOnHit = true;
                        knockback = 0.8f;
                        hittable = true;
                    }},
                    FlareItems.flarogusItem, new ArtilleryBulletType(12f, 215) {{
                        ammoMultiplier = 1;
                        splashDamage = 560;
                        splashDamageRadius = 75f;
                        reloadMultiplier = 0.02f;
                        hitSize = 5;
                        width = 22;
                        height = 26;
                        frontColor = Pal.lightOrange;
                        backColor = Pal.lighterOrange;
                        lifetime = 111.95f;
                        rangeChange = 221f;
                        collidesAir = true;
                        hitEffect = Fx.colorSparkBig;
                        smokeEffect = Fx.fireSmoke;
                        despawnEffect = Fx.fire;
                        pierce = true;
                        pierceCap = 12;
                        status = FlareStatus.flarogusStatus;
                        statusDuration = 308f;
                        makeFire = true;
                        incendAmount = 6;
                        incendSpread = 12;
                        incendChance = 0.9899f;
                        fragOnHit = true;
                        knockback = 0.12f;
                        hittable = true;
                    }}
            );
            reload = 1.4f;
            recoilTime = reload * 2;
            coolantMultiplier = 0.8f;
            ammoUseEffect = Fx.casing3;
            range = 184.85f;
            inaccuracy = 3f;
            recoil = 5.2f;
            shake = 1.5f;
            size = 3;
            shootCone = 18f;
            shootSound = Sounds.shootBig;

            scaledHealth = 145;
            coolant = consumeCoolant(1f);

        }};

        venerate = new ItemTurret("venerate") {
            {
                requirements(Category.turret, with(Items.copper, 620, Items.graphite, 405, Items.titanium, 450, Items.silicon, 255, Items.thorium, 100, Items.plastanium, 280));
                ammo(
                        Items.plastanium, new FlakBulletType(11f, 28) {{
                            hitSize = 4f;
                            width = 9f;
                            height = 12f;
                            lifetime = 45f;
                            collidesAir = true;
                            smokeEffect = Fx.fireSmoke;
                            shootEffect = Fx.shootSmall;
                            pierce = true;
                            pierceCap = 4;
                            fragOnHit = true;
                            fragBullet = new BasicBulletType(14f, 35) {{
                                width = 6f;
                                height = 10f;
                                shrinkY = 1f;
                                lifetime = 25f;
                                frontColor = Pal.plastaniumFront;
                                backColor = Pal.plastaniumBack;
                            }};
                            fragBullets = 15;
                            hitEffect = Fx.plasticExplosion;
                            frontColor = Pal.plastaniumFront;
                            backColor = Pal.plastaniumBack;
                            collidesGround = true;
                            explodeRange = 35f;
                            hittable = true;
                            hitEffect = new MultiEffect(Fx.hitBulletSmall, Fx.flakExplosion);
                            ammoMultiplier = 3;
                            splashDamage = 75f;
                            splashDamageRadius = 56f;
                            knockback = 3.6f;
                        }},
                        FlareItems.susgeAlloy, new FlakBulletType(14f, 95) {{
                            hitSize = 6f;
                            width = 12f;
                            height = 14f;
                            frontColor = Pal.missileYellow;
                            backColor = Pal.missileYellowBack;
                            lifetime = 45f;
                            hitEffect = Fx.plasticExplosion;
                            smokeEffect = Fx.fireSmoke;
                            shootEffect = Fx.shootSmall;
                            pierce = true;
                            pierceCap = 6;
                            fragOnHit = true;
                            fragBullet = new BasicBulletType(18f, 78) {{
                                width = 7f;
                                height = 11f;
                                shrinkY = 1f;
                                lifetime = 25f;
                                frontColor = Pal.missileYellow;
                                backColor = Pal.missileYellowBack;
                            }};
                            fragBullets = 22;
                            collidesGround = true;
                            collidesAir = true;
                            explodeRange = 54f;
                            hittable = true;
                            hitEffect = new MultiEffect(Fx.hitBulletSmall, Fx.flakExplosion);
                            ammoMultiplier = 2;
                            splashDamage = 275;
                            splashDamageRadius = 42f;
                            knockback = 2.4f;
                        }}
                );
                shootY = 9.45f;
                shoot = new ShootBarrel() {
                    {
                        barrels = new float[]{
                                0f, 1f, 0f,
                                3f, 0f, 0f,
                                -3f, 0f, 0f,
                        };
                    }
                };
                reload = 0.2f;
                recoilTime = reload * 5;
                coolantMultiplier = 1.2f;
                ammoUseEffect = Fx.casing3;
                range = 245.822f;
                inaccuracy = 15f;
                recoil = 8.2f;
                rotateSpeed = 25f;
                shake = 1.4f;
                size = 3;
                shootCone = 60f;
                shootSound = Sounds.shootSnap;

                scaledHealth = 120;
                coolant = consumeCoolant(1.2f);
                limitRange();
            }
        };

        fart = new ItemTurret("fart") {{
            requirements(Category.turret, with(Items.copper, 6000, Items.lead, 6000, Items.sand, 6000, Items.coal, 6000, Items.scrap, 6000, Items.graphite, 6000, Items.silicon, Items.titanium, 6000, Items.pyratite, 6000, Items.metaglass, 6000, Items.sporePod, 6000, Items.thorium, 6000, Items.plastanium, 6000, Items.blastCompound, 6000, Items.phaseFabric, 6000, Items.surgeAlloy, 6000, FlareItems.flareItem, 600, FlareItems.susgeAlloy, 600, FlareItems.flarogusItem, 600));
            ammo(
                    FlareItems.shit, new BasicBulletType(8, 20000) {{
                        hitSize = 16f;
                        width = 16f;
                        height = 16f;
                        ammoMultiplier = 3;
                        splashDamage = 500;
                        splashDamageRadius = 10000f;
                        reloadMultiplier = 1.2f;
                        frontColor = Pal.lightOrange;
                        backColor = Pal.lighterOrange;
                        shootEffect = Fx.massiveExplosion;
                        smokeEffect = Fx.fireSmoke;
                        despawnEffect = Fx.blastExplosion;
                        pierce = true;
                        pierceCap = 10000;
                        status = FlareStatus.explosiveDiarrhea;
                        statusDuration = 25200f;
                        fragOnHit = true;
                        knockback = 80f;
                        hittable = false;
                    }}
            );
            reload = 200f;
            recoilTime = reload * 5;
            coolantMultiplier = 0.92f;
            ammoUseEffect = Fx.casing3;
            range = 400f;
            inaccuracy = 20f;
            recoil = 40f;
            shake = 50f;
            size = 5;
            shootCone = 20f;
            shootSound = Sounds.wind3;

            scaledHealth = 1000;
            coolant = consumeCoolant(2f);
        }};

        flareMaterializer = new GenericCrafter("flare-materializer") {{
            requirements(Category.crafting, with(Items.copper, 200, Items.lead, 45, Items.titanium, 60, Items.graphite, 120, Items.silicon, 80, Items.thorium, 75));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(FlareItems.flareItem, 1);
            craftTime = 105f;
            size = 3;
            itemCapacity = 25;
            hasPower = true;
            hasLiquids = false;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame(Color.valueOf("ffef99")));
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.109f;

            consumeItems(with(Items.silicon, 2, Items.thorium, 3));
            consumePower(7.3334f);
        }};

        susgeUnifier = new GenericCrafter("susge-unifier") {{
            requirements(Category.crafting, with(Items.copper, 300, Items.lead, 85, Items.titanium, 40, Items.graphite, 140, Items.silicon, 85, Items.thorium, 85, Items.plastanium, 20));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(FlareItems.susgeAlloy, 1);
            craftTime = 240f;
            size = 4;
            itemCapacity = 30;
            hasPower = true;
            hasLiquids = false;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame());
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.294f;

            consumeItems(with(Items.plastanium, 3, Items.surgeAlloy, 3));
            consumePower(9.2f);
        }};

        flarogusIntegrator = new GenericCrafter("flarogus-integrator") {{
            requirements(Category.crafting, with(Items.copper, 500, Items.lead, 245, Items.titanium, 260, Items.graphite, 320, Items.silicon, 180, Items.metaglass, 50, Items.thorium, 175, Items.plastanium, 80, Items.surgeAlloy, 25, FlareItems.susgeAlloy, 50, FlareItems.flareItem, 20));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(FlareItems.flarogusItem, 1);
            craftTime = 192f;
            size = 5;
            itemCapacity = 28;
            hasPower = true;
            hasLiquids = false;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame());
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.6824f;

            consumeItems(with(FlareItems.flareItem, 5, FlareItems.susgeAlloy, 1));
            consumePower(14f);
        }};

        shitHardener = new GenericCrafter("shitHardener") {{
            requirements(Category.crafting, with(Items.copper, 600, Items.lead, 150, Items.titanium, 950, Items.graphite, 540, Items.silicon, 800, Items.thorium, 450, Items.surgeAlloy, 165, FlareItems.flareItem, 70, FlareItems.flarogusItem, 20));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(FlareItems.shit, 1);
            craftTime = 300f;
            size = 4;
            itemCapacity = 18;
            hasPower = true;
            hasLiquids = true;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame());
            ambientSound = Sounds.wind3;
            ambientSoundVolume = 2f;

            consumeItems(with(Items.sand, 15, Items.sporePod, 5, Items.plastanium, 3));
            consumeLiquid(FlareLiquids.diarrheaJuice, 60f);
            consumePower(60f);
        }};

        foskerDrill = new Drill("fosker-drill") {{
            size = 4;
            health = 460;
            tier = 6;
            drillTime = 205f;
            liquidBoostIntensity = 1.35f;
            warmupSpeed = 0.4f;
            consumePower(8.4f);
            consumeLiquid(Liquids.water, 0.14f).optional(false, false);
            consumeLiquid(Liquids.cryofluid, 0.16f).optional(false, true);
            requirements(Category.production, BuildVisibility.shown, with(Items.copper, 150, Items.lead, 75, Items.silicon, 85, Items.thorium, 95, Items.plastanium, 45, FlareItems.verentium, 15));
        }};

        draetheumWall = new Wall("draetheum-wall"){{
            requirements(Category.defense, with(Items.plastanium, 4, FlareItems.draetheusAlloy, 8));
            health = 1105;
        }};
    }}
