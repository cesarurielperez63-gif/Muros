# calculadora.py
def iniciar_calculadora():
    print("--- Calculadora Iniciada ---")
    while True:
        entrada = input("Ingresa un número para operar (o escribe '999' para salir del programa): ")
        
        if entrada == '999':
            print("Terminando ejecución...")
            break
            
        print(f"Número registrado: {entrada}")
        # Aquí iría el resto de la lógica (sumas, restas, etc.)

if __name__ == "__main__":
    iniciar_calculadora()