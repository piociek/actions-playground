import os

def run():
    print("Hello from python docker")
    input_val = os.environ['INPUT_SIMPLE-INPUT']
    print("Simple input val: " + input_val)
    print(f'::set-output name=simple-output""Output val')


if __name__ == '__main__':
    run()