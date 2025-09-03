import java.util.Map;

public class DiscountCalculator {
    // O mapa injetado, que associa um nome (String) a uma política
    // (DiscountPolicy).
    private final Map<String, DiscountPolicy> policies;

    // Construtor que recebe o mapa de políticas.
    public DiscountCalculator(Map<String, DiscountPolicy> policies) {
        this.policies = policies;
    }

    public double calculate(String policyName, double amount) {
        // Encontra a política correta no mapa.
        DiscountPolicy policy = policies.get(policyName);

        // Se a política não for encontrada, lança uma exceção ou retorna um valor
        // padrão.
        if (policy == null) {
            throw new IllegalArgumentException("Política de desconto não encontrada: " + policyName);
        }

        // Aplica a política encontrada para calcular o desconto.
        return policy.apply(amount);
    }
}