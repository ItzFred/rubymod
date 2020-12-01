package net.mcreator.rubymod.procedures;

@RubymodModElements.ModElement.Tag
public class OiledOnPotionActiveTickProcedure extends RubymodModElements.ModElement {

	public OiledOnPotionActiveTickProcedure(RubymodModElements instance) {
		super(instance, 31);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure OiledOnPotionActiveTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure OiledOnPotionActiveTick!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");

		if ((world.getWorld().isRaining())) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LEVITATION, (int) 600, (int) 1));
		}

	}

}
